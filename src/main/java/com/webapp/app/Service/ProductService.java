package com.webapp.app.Service;

import com.webapp.app.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private List<Product> productList;

    public void addProduct(Product product){
        productList.add(product);
    }
    public List<Product> findAllProduct(){
        return productList;
    }
}
