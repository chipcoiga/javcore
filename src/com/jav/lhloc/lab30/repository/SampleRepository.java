package com.jav.lhloc.lab30.repository;

public class SampleRepository {
    private final String dbUrlConnection;

    public SampleRepository(String dbUrlConnection, String username, String password) {
        this.dbUrlConnection = dbUrlConnection;
    }

    public void connectDatabase() {
        System.out.println("Connecting to database: " + dbUrlConnection);
    }
}
