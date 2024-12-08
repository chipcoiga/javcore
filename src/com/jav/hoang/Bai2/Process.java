package com.jav.hoang.Bai2;

import com.jav.hoang.BaiTap3.ProductManagement;

import java.util.Scanner;

public class Process {

    public static void main(String[] args) {
        Process process = new Process();
        EmployManagementSystem employManagementSystem = new EmployManagementSystem();


        int option;
        option = selectOption();
        do {
            hienthiMenu();
            switch (option) {
                case 1:
                    System.out.println("1.Show add employee display ");
                    Employee em = createEmployee();
                    employManagementSystem.addEmployee(em);
                    break;
                case 2:
                    System.out.println("2. Display all employees display");
                    employManagementSystem.xuatEmployee();
                    break;
                case 3:
                    System.out.println("3. Calculate total salary display");
                    double luong = employManagementSystem.caculateAllSalary();
                    break;
                default:
                    System.out.println("Exit");
            }
        } while (option < 5);
    }

    private static Employee createEmployee() {
        return null;
    }
    private static int selectOption() {
            Scanner scanner = new Scanner(System.in);

            return scanner.nextInt();


}

    private static void hienthiMenu() {
        System.out.println("1. Add Employee");
        System.out.println("2. Display all employees");
        System.out.println("3. Calculate total salary");
        System.out.println("4. Exit");
    }}
