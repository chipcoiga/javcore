package com.jav.hoang.Bai2;

public class Manager extends Employee {
    private long bonus;



    public Manager(String ten, int id, double luong, Department department) {
        super(ten, id, luong, department);
    }

    @Override
    public double caculateSalary() {
        return getLuong() * bonus;
    }
}
