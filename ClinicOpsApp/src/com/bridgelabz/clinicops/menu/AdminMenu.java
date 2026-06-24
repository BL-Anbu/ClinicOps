package com.bridgelabz.clinicops.menu;

import com.bridgelabz.clinicops.util.ScannerHelper;

public class AdminMenu {

    private static final int DOCTOR_ENTRY = 1;
    private static final int BULK_IMPORT = 2;
    private static final int AUDIT_LOGS = 3;
    private static final int LOGOUT = 4;

    private AdminMenu() {
    }

    public static void showMenu() {

        boolean logout = false;

        while (!logout) {
            System.out.println("----- CLINIC ADMIN MENU -----");

            System.out.println("1. Doctor's Entry");
            System.out.println("2. Bulk Entry (CSV)");
            System.out.println("3. View Audit Logs");
            System.out.println("4. Logout");
            System.out.print("\nEnter your choice: ");

            int choice = ScannerHelper.readIntegerInput();
            switch (choice) {
                case DOCTOR_ENTRY:
                    System.out.println("\n[Placeholder] Doctor Data Entry functionality will be implemented in future UC.");
                    break;
                case BULK_IMPORT:
                    System.out.println("\n[Placeholder] Bulk Import functionality will be implemented in future UC.");
                    break;
                case AUDIT_LOGS:
                    System.out.println("\n[Placeholder] Audit Log functionality will be implemented in future UC.");
                    break;
                case LOGOUT:
                    System.out.println("\nLogging out from Clinic Admin...");
                    logout = true;
                    break;
                default:
                    System.out.println("\nInvalid option. Please enter 1 to 4.");
            }
        }
    }
}