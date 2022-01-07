package ir.ali.springboot.webapp.dao;

import ir.ali.springboot.webapp.entity.Product;

public interface ProductDAO {

    void saveInDB(Product theProduct);

    double avgPrice(float minWeight, float maxWeight);
}
