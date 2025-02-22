package org.example.resumeFilteringSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> skills1 = new ArrayList<>();
        skills1.add("Java");
        skills1.add("Spring");

        ArrayList<String> skills2 = new ArrayList<>();
        skills2.add("Javascript");
        skills2.add("HTML");
        skills2.add("CSS");

        Address address1 = new Address("5 Forest Hill Dr", "Glen Ellyn", "IL", "60137");
        Address address2 = new Address("35 Poncetta Dr", "Daly City", "CA", "94015");

        ArrayList<Resume> resumes = new ArrayList<>();
        resumes.add(new Resume("Muhiddin Kurbonov", 5, skills1, address1));
        resumes.add(new Resume("Sam Smith", 4, skills2, address2));
        resumes.add(new Resume("Tim Kirby", 5, skills1, address1)); // Duplicate ( just different name)
        resumes.add(new Resume("Mike Kelly", 5, skills2, address2)); // Another duplicate
    }
 }
