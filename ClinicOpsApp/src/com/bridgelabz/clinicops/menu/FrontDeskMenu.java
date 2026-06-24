package com.bridgelabz.clinicops.menu;

import com.bridgelabz.clinicops.util.ScannerHelper;

public class FrontDeskMenu {

    private static final int PATIENT_REGISTRATION = 1;
    private static final int BOOK_APPOINTMENT = 2;
    private static final int LOGOUT = 3;

    private FrontDeskMenu() {
    }

    public static void showMenu() {
        boolean logout = false;
        while (!logout) {
            System.out.println("----- FRONT DESK MENU -----");
            System.out.println("1. Patient Registration");
            System.out.println("2. Book Appointment");
            System.out.println("3. Logout");
            System.out.print("\nEnter your choice: ");

            int choice = ScannerHelper.readIntegerInput();
            switch (choice) {
                case PATIENT_REGISTRATION:
                    System.out.println("\n[Placeholder] Patient Registration functionality will be implemented in future UC.");
                    break;
                case BOOK_APPOINTMENT:
                    System.out.println("\n[Placeholder] Appointment Booking functionality will be implemented in future UC.");
                    break;
                case LOGOUT:
                    System.out.println("\nLogging out from Front Desk Executive...");
                    logout = true;
                    break;
                default:
                    System.out.println("\nInvalid option. Please enter 1 to 3.");
            }
        }
    }
}