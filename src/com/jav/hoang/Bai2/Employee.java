package com.jav.hoang.Bai2;

public abstract class Employee {
    private String ten;
    private int id ;
    private double luong;
    private Department department;


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    public Employee(String ten,int id,double luong,Department department ){
        this.ten = ten;
        this.id = id;
        this.luong = luong;
        this.department =department;
    }

    public abstract double caculateSalary() ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }




}
