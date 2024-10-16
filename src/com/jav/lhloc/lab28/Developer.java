package com.jav.lhloc.lab28;

public class Developer extends Employee {

    private int overtime;
    private long rate;

    public Developer(String name,
                     int id,
                     long salary,
                     Department department,
                     int overtime,
                     long rate) {
        super(name, id, salary, department);
        this.overtime = overtime;
        this.rate = rate;
    }

    @Override
    public long calculateSalary() {

        long baseSalary = getSalary();
        long overTimeSalary = overtime * rate;

        return baseSalary + overTimeSalary;
    }

    public int getOvertime() {
        return overtime;
    }

    public long getRate() {
        return rate;
    }
}
