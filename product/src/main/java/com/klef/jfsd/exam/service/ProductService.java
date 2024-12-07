package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klef.jfsd.exam.entity.Product;


import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    	
    public List<Product> fetchAllProducts() {
        String url = "https://fakestoreapi.com/products";
        Product[] products = restTemplate.getForObject(url, Product[].class);
        return Arrays.asList(products);
    }
}

