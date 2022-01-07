package ir.ali.springboot.webapp.service;

import ir.ali.springboot.webapp.entity.Product;

public interface ProductService {

    void saveInDB(Product theProduct);

    double avgPrice(float minWeight, float maxWeight);
}
