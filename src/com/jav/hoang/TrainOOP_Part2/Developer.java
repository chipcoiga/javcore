package com.jav.hoang.TrainOOP_Part2;

public class Developer extends Employee{
    int overtime;

    public Developer(String name, int id, double Salary, Department department, int overtime) {
        super(name, id, Salary, department);
        this.overtime = overtime;
    }

    @Override
    public double SumSalary() {
        return 0;
    }
}
