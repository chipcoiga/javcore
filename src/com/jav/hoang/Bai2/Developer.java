package com.jav.hoang.Bai2;

public class Developer extends Employee {
    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    private int overtime;
    private double rate;




    public Developer(String ten, int id, double luong, Department department , int overtime,double rate) {
        super(ten, id, luong, department);
        this.overtime = overtime;
        this.rate = rate;

    }

    @Override
    public double caculateSalary() {
        double baseSalary = getLuong();
        double overtimeSalary = overtime *rate;
        return baseSalary + overtimeSalary;
    }
}
