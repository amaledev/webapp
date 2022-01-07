package ir.ali.springboot.webapp.service;

import ir.ali.springboot.webapp.dao.ProductDAO;
import ir.ali.springboot.webapp.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO theProductDAO) {
        productDAO = theProductDAO;
    }

    @Override
    @Transactional
    public void saveInDB(Product theProduct) {
        productDAO.saveInDB(theProduct);
    }

    @Override
    @Transactional
    public double avgPrice(float minWeight, float maxWeight) {
        return productDAO.avgPrice(minWeight, maxWeight);
    }
}
