package ir.ali.springboot.webapp.rest;

import ir.ali.springboot.webapp.entity.Product;
import ir.ali.springboot.webapp.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductService productService;

    public ProductRestController(ProductService theProductService) {
        productService = theProductService;
    }

    @PostMapping("/products")
    public Product saveInDB(@RequestBody Product theProduct) {

        //also just in case they pass an id in JSON ... set id to 0
        //this is to force a save of new item ... instead of update
        theProduct.setId(0);
        productService.saveInDB(theProduct);
        return theProduct;
    }

    @GetMapping("/average")
    public double avgPrice(@RequestParam float minWeight, @RequestParam float maxWeight) {
        return productService.avgPrice(minWeight, maxWeight);
    }
}
