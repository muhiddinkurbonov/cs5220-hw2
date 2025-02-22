package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Address address = new Address("5 Forest Hill Dr", "Glen Ellyn", "IL", "60137");
        Employee employee = new Employee("51790", "Muhiddin Kurbonov", "Team Associate", 32000, address);
        Employee backup = null;


    }
}