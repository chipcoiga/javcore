package com.jav.hoang.TrainOOP_Part2;

public class Manager extends Employee{
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    double bonus;


    public Manager(String name, int id, double Salary, Department department, double bonus) {
        super(name, id, Salary, department);
        this.bonus = bonus;
    }

    @Override
    public double SumSalary() {
        return getSalary()*getBonus();
    }
}
