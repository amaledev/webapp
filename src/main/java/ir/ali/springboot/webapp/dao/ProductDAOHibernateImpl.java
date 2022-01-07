package ir.ali.springboot.webapp.dao;

import ir.ali.springboot.webapp.entity.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ProductDAOHibernateImpl implements ProductDAO {

    //define field for entitymanager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public ProductDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void saveInDB(Product theProduct) {

        //get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //save product
        currentSession.saveOrUpdate(theProduct);
    }

    @Override
    public double avgPrice(float minWeight, float maxWeight) {

        //get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //create a query
        Query<Double> theQuery = currentSession.createQuery("select avg(p.value) from Product p where p.weight between :minWeight and :maxWeight ", Double.class)
                .setParameter("minWeight", minWeight).setParameter("maxWeight", maxWeight);

        //execute query and get result list
        double result = theQuery.getSingleResult();

        //return the results
        return result;
    }
}
