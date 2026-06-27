package com.bridgelabz.clinicops.menu;

import com.bridgelabz.clinicops.model.Doctor;
import com.bridgelabz.clinicops.util.ScannerHelper;

import java.util.ArrayList;

public class AdminMenu {

    private static final ArrayList<Doctor> doctorList = new ArrayList<>();
    private static int doctorIdCounter = 1;

    private AdminMenu() {
    }

    public static void showMenu() {
        boolean logout = false;
        while (!logout) {
            displayAdminOptions();
            int choice = ScannerHelper.readInteger("\nEnter your choice: ");
            switch (choice) {
                case 1:
                    registerDoctors();
                    break;
                case 2:
                    System.out.println("\nBulk Import feature will be implemented in upcoming use cases.");
                    break;
                case 3:
                    System.out.println("\nAudit Log feature will be implemented in upcoming use cases.");
                    break;
                case 4:
                    displayDoctors();
                    break;
                case 5:
                    System.out.println("\nLogging out from Clinic Admin...");
                    logout = true;
                    break;
                default:
                    System.out.println("\nInvalid option. Please enter between 1 and 5.");
            }
        }
    }

    private static void displayAdminOptions() {
        System.out.println("----- CLINIC ADMIN MENU -----");

        System.out.println("1. Doctor Data Entry");
        System.out.println("2. Bulk Data Entry");
        System.out.println("3. View Audit Logs");
        System.out.println("4. Display Doctors");
        System.out.println("5. Logout");
    }

    private static void registerDoctors() {
        System.out.println("\n-------Registering New Doctor ------");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEnter Doctor " + i + " Details");
            String doctorId = String.format("D%04d", doctorIdCounter++);
            String name = ScannerHelper.readString("Doctor Name : ");
            String specialization = ScannerHelper.readString("Specialization : ");
            int experience = ScannerHelper.readInteger("Experience : ");
            String shift = ScannerHelper.readString("Shift (Morning/Evening/Both) : ");

            Doctor doctor = new Doctor(doctorId, name, specialization, experience, shift);
            doctorList.add(doctor);
            System.out.println("\nDoctors Registered Successfully with ID : " + doctorId);

        }
    }

    private static void displayDoctors() {
        if (doctorList.isEmpty()) {
            System.out.println("\nNo Doctors Registered.");
            return;
        }
        System.out.println("\n============== Doctor List ==============");
        for (Doctor doctor : doctorList) {
            System.out.println(doctor);
            System.out.println("-----------------------------------------");
        }
    }
}