package com.bridgelabz.clinicops.util;

import java.util.Scanner;

public class ScannerHelper {

    private static final Scanner SCANNER = new Scanner(System.in);

    private ScannerHelper() {
    }

    public static int readIntegerInput() {
        while (true) {
            try {
                int value = Integer.parseInt(SCANNER.nextLine());
                return value;
            } catch (NumberFormatException exception) {
                System.out.print("Invalid input. Enter a number: ");
            }
        }
    }
}