package com.jav.hoang.TrainOOP_Part2;

public abstract class Employee {
    String name;
    int id;
    double Salary;
    private Department department;



    public Employee (String name, int id,double Salary,Department department){
        this.name= name;
        this.id = id ;
        this.Salary = Salary;
        this.department = department;

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



public abstract double SumSalary();

}


