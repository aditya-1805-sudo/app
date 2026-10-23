package com.webapp.app.controller;

import com.webapp.app.Models.Product;
import com.webapp.app.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model){
        var products=productService.findAllProduct();
        model.addAttribute("products",products);
        return "products";
    }
    @PostMapping("/products{price}")
    public String addProducts(Model model, Product product){
//        var product=new Product();
//        product.setName(name);
//        product.setPrice(price);
        productService.addProduct(product);
        var products=productService.findAllProduct();
        model.addAttribute("products",products);
        return "products";
    }
}
