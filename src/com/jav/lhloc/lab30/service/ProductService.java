package com.jav.lhloc.lab30.service;

import com.jav.lhloc.lab30.repository.ProductRepository;

public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void doSomething() {
        repository.connectDatabase();
        System.out.println("Saving to database"); //lưu db....
    }
}
