package com.bridgelabz.clinicops.menu;

import com.bridgelabz.clinicops.util.ScannerHelper;

public class AdminMenu {

    private static String doctor1Name;
    private static String doctor1Specialization;
    private static int doctor1Experience;
    private static String doctor1Slot;

    private static String doctor2Name;
    private static String doctor2Specialization;
    private static int doctor2Experience;
    private static String doctor2Slot;

    private static String doctor3Name;
    private static String doctor3Specialization;
    private static int doctor3Experience;
    private static String doctor3Slot;

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
                    System.out.println("\n[Placeholder] Bulk Import functionality will be implemented in future UC.");
                    break;
                case 3:
                    System.out.println("\n[Placeholder] Audit Log functionality will be implemented in future UC.");
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
        System.out.println("\nEnter Doctor 1 Details");

        doctor1Name = ScannerHelper.readString("Doctor Name: ");
        doctor1Specialization = ScannerHelper.readString("Specialization: ");
        doctor1Experience = ScannerHelper.readInteger("Experience (Years): ");
        doctor1Slot = ScannerHelper.readString("Availability Slot (Morning/Evening/Both): ");

        System.out.println("\nEnter Doctor 2 Details");

        doctor2Name = ScannerHelper.readString("Doctor Name: ");
        doctor2Specialization = ScannerHelper.readString("Specialization: ");
        doctor2Experience = ScannerHelper.readInteger("Experience (Years): ");
        doctor2Slot = ScannerHelper.readString("Availability Slot (Morning/Evening/Both): ");

        System.out.println("\nEnter Doctor 3 Details");

        doctor3Name = ScannerHelper.readString("Doctor Name: ");
        doctor3Specialization = ScannerHelper.readString("Specialization: ");
        doctor3Experience = ScannerHelper.readInteger("Experience (Years): ");
        doctor3Slot = ScannerHelper.readString("Availability Slot (Morning/Evening/Both): ");

        System.out.println("\nDoctors registered successfully.");
    }

    private static void displayDoctors() {
        System.out.println("----- REGISTERED DOCTORS -----");

        if (doctor1Name == null) {
            System.out.println("No doctors registered yet.");
            return;
        }

        System.out.println("\nDoctor 1");
        System.out.println("Name : " + doctor1Name);
        System.out.println("Specialization : " + doctor1Specialization);
        System.out.println("Experience : " + doctor1Experience + " Years");
        System.out.println("Slot : " + doctor1Slot);

        System.out.println("\nDoctor 2");
        System.out.println("Name : " + doctor2Name);
        System.out.println("Specialization : " + doctor2Specialization);
        System.out.println("Experience : " + doctor2Experience + " Years");
        System.out.println("Slot : " + doctor2Slot);

        System.out.println("\nDoctor 3");
        System.out.println("Name : " + doctor3Name);
        System.out.println("Specialization : " + doctor3Specialization);
        System.out.println("Experience : " + doctor3Experience + " Years");
        System.out.println("Slot : " + doctor3Slot);
    }
}