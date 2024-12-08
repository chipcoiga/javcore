package com.jav.hoang.Bai2;

import java.util.ArrayList;

public class EmployManagementSystem {

    ArrayList<Employee> Emp = new ArrayList();

    public void addEmployee(Employee employee) {
        Emp.add(employee);

    }

    public void xuatEmployee() {
        for (Employee em : Emp) {
            System.out.println("Ten" + em.getTen() + "Id" + em.getId() + "luong " + em.getLuong() + "department " + em.getDepartment());

        }

    }

    public double caculateAllSalary() {
        double tongSalary = 0;
        for (Employee em : Emp) {
            tongSalary += em.caculateSalary();
        }
        return tongSalary;
    }
}