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
        resumes.add(new Resume("Mike Kelly", 4, skills2, address2)); // Another duplicate

        System.out.println("\n--- All Received Applications ---\n");
        for (int i = 0; i < resumes.size(); i++) {
            System.out.println("Resume #" + (i + 1) + ":");
            System.out.println(resumes.get(i));
            System.out.println();
        }

        // Check for duplicates
        ArrayList<Resume> uniqueResumes = new ArrayList<>();
        ArrayList<Resume> duplicates = new ArrayList<>();

        for (Resume resume: resumes) {
            if (uniqueResumes.contains(resume)) {
                duplicates.add(resume);
            } else {
                uniqueResumes.add(resume);
            }
        }

        if(!duplicates.isEmpty()) {
            System.out.println("--- Duplicate Applications Found ---\n");
            for(Resume duplicate: duplicates) {
                System.out.println(duplicate);
            }
        }
        System.out.println("\n--- Final Unique Applications ---\n");
        for (int i = 0; i < uniqueResumes.size(); i++) {
            System.out.println("Resume #" + (i+1) + ":");
            System.out.println(uniqueResumes.get(i));
            System.out.println();
        }
        System.out.println("Total Unique Applications: " + uniqueResumes.size());
    }
 }
