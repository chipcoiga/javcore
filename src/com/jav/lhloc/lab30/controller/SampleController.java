package com.jav.lhloc.lab30.controller;

import com.jav.lhloc.lab30.service.SampleService;

public class SampleController {
    private final SampleService service;

    public SampleController(SampleService service) {
        this.service = service;
    }

    public void doSomething() {
        service.doSomething();
    }
}
