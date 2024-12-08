package com.jav.hoang.TrainOOP_Part2;

import java.util.ArrayList;

public class EmployeeManagement {

    ArrayList<Employee> em = new ArrayList<>();



    public void AddEmployee(Employee addArr){
        em.add(addArr);

    }
    public void ShowAllEmployee (Employee show){
        for (Employee x : em ){
            System.out.println(" Ten: " + x.getName() + " ID :" + x.getId());
        }

    }
    public double tongLuong (){
        double tong = 0.0 ;

        for (Employee x : em){
            tong  +=x.getSalary();
        }
        return tong;
    }
}
