package com.jav.lhloc.lab28;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public Long calculateTotalSalary() {
        long totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
//            totalSalary = totalSalary + employee.calculateSalary();
        }
        return totalSalary;
    }
}
