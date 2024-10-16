package com.jav.lhloc.lab28;

import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Process process = new Process();
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        process.showMenu();

        int option;

        do {
            option = process.getOption();

            switch (option) {
                case 1:
                    System.out.println("Add Employee: ");
                    Employee employee = process.createEmployee();
                    employeeManagementSystem.addEmployee(employee);
                    break;
                case 2:
                    System.out.println("Display all employees: ");
                    employeeManagementSystem.displayAllEmployees();
                    break;
                case 3:
                    long totalSalary = employeeManagementSystem.calculateTotalSalary();
                    System.out.println("Total salary: " + totalSalary);
                    break;
                default:
                    System.out.println("Exit");
            }
        } while (option < 4);
    }

    private Employee createEmployee() {
        Department department = selectDepartment();

        int employeeType = selectEmployeeType();

        if (employeeType == 1) {
            return createDeveloper(department);
        }

        if (employeeType == 2) {
            return createManager(department);
        }

        return null;
    }

    private Employee createManager(Department department) {
        System.out.println("Enter manager name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter manager id: ");
        int id = scanner.nextInt();
        System.out.println("Enter manager salary: ");
        long salary = scanner.nextLong();
        System.out.println("Enter manager bonus: ");
        long bonus = scanner.nextLong();
        return new Manager(name, id, salary, department, bonus);
    }

    private Employee createDeveloper(Department department) {
        System.out.println("Enter developer name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter developer id: ");
        int id = scanner.nextInt();
        System.out.println("Enter developer salary: ");
        long salary = scanner.nextLong();
        System.out.println("Enter developer overtime: ");
        int overtime = scanner.nextInt();
        System.out.println("Enter developer rate: ");
        long rate = scanner.nextLong();
        return new Developer(name, id, salary, department, overtime, rate);
    }

    private int selectEmployeeType() {
        System.out.println("Select employee type: ");
        System.out.println("1. Developer");
        System.out.println("2. Manager");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private Department selectDepartment() {
        System.out.println("Select department: ");
        System.out.println("1. IT");
        System.out.println("2. HR");
        System.out.println("3. Marketing");
        System.out.println("4. Finance");
        Scanner scanner = new Scanner(System.in);
        int departmentOption = scanner.nextInt();
        switch (departmentOption) {
            case 1:
                return Department.IT;
            case 2:
                return Department.HR;
            case 3:
                return Department.MARKETING;
            case 4:
                return Department.FINANCE;
            default:
                return null;
        }
    }

    private int getOption() {
        System.out.println("Enter option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void showMenu() {
        System.out.println("1. Add Employee");
        System.out.println("2. Display all employees");
        System.out.println("3. Calculate total salary");
        System.out.println("4. Exit");
    }
}
