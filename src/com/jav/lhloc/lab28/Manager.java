package com.jav.lhloc.lab28;

public class Manager extends Employee {

    private long bonus;

    public Manager(String name,
                   int id,
                   long salary,
                   Department department,
                   long bonus) {
        super(name, id, salary, department);
        this.bonus = bonus;
    }

    @Override
    public long calculateSalary() {
        return getSalary() + bonus;
    }

    public long getBonus() {
        return bonus;
    }

}
