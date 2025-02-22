package org.example.employeeRecordManagement;

import org.example.employeeRecordManagement.Address;
import org.example.employeeRecordManagement.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Address address = new Address("5 Forest Hill Dr", "Glen Ellyn", "IL", "60137");
        Employee employee = new Employee("51790", "Muhiddin Kurbonov", "Team Associate", 32000, address);
        Employee backup = null;

        while (true) {
            // Display current record
            System.out.println("\nCurrent Employee Record:");
            System.out.println("--------------------");
            System.out.println(employee);
            System.out.println("--------------------");

            // Menu
            System.out.println("\nOptions:");
            System.out.println("1. Edit Record");
            System.out.println("2. Undo Last Change");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Store backup before changes
                    try {
                        backup = (Employee) employee.clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }

                    // Edit menu
                    System.out.println("\nWhat to edit?");
                    System.out.println("1. Name");
                    System.out.println("2. Designation");
                    System.out.println("3. Salary");
                    System.out.println("4. Address");
                    System.out.print("Enter choice: ");
                    int editChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (editChoice) {
                        case 1:
                            System.out.print("Enter new name: ");
                            employee.setName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.print("Enter new designation: ");
                            employee.setDesignation(scanner.nextLine());
                            break;
                        case 3:
                            System.out.print("Enter new salary: ");
                            employee.setSalary(scanner.nextDouble());
                            break;
                        case 4:
                            System.out.print("Enter new street: ");
                            String street = scanner.nextLine();
                            System.out.print("Enter new city: ");
                            String city = scanner.nextLine();
                            System.out.print("Enter new state: ");
                            String state = scanner.nextLine();
                            System.out.print("Enter new zipcode: ");
                            String zip = scanner.nextLine();
                            employee.setAddress(new Address(street, city, state, zip));
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;

                case 2:
                    if (backup != null) {
                        try {
                            employee = (Employee) backup.clone();
                            System.out.println("Changes undone successfully");
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("No previous version available");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}