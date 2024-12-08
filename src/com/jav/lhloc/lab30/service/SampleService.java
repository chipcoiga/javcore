package com.jav.lhloc.lab30.service;

import com.jav.lhloc.lab30.repository.SampleRepository;

public class SampleService {
    private final SampleRepository repository;

    public SampleService(SampleRepository repository) {
        this.repository = repository;
    }

    public void doSomething() {
        repository.connectDatabase();
        System.out.println("Saving to database"); //lưu db....
    }
}
