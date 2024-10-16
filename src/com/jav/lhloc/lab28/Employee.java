package com.jav.lhloc.lab28;

public abstract class Employee {
    private String name;
    private int id;
    private long salary;
    private Department department;

    public Employee(String name, int id, long salary, Department department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public abstract long calculateSalary();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }
}
