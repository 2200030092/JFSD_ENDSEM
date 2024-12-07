package com.klef.jfsd.exam.controller;


import com.klef.jfsd.exam.entity.Product;
import com.klef.jfsd.exam.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.fetchAllProducts();
    }
}
