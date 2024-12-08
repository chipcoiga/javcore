package com.jav.lhloc.lab30.repository;

public class ProductRepository {
    private final String dbUrlConnection;

    public ProductRepository(String dbUrlConnection) {
        this.dbUrlConnection = dbUrlConnection;
    }

    public void connectDatabase() {
        System.out.println("Connecting to database: " + dbUrlConnection);
    }
}
