/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06labactivity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in) //
        ) {
            do {
                System.out.println("\n!  Day of Year Application  ! <3");
                System.out.println("Please enter the month (1-12): ");
                int month = getValidInput(scanner, 1, 12);

                System.out.println("Please enter the day of the month (1-31): ");
                int dayOfMonth = getValidInput(scanner, 1, 31);

                System.out.println("Please enter the year: ");
                int year = getValidInput(scanner, 0, Integer.MAX_VALUE);

                int dayOfYear = dayOfYear(month, dayOfMonth, year);

                System.out.println("Day of year is " + dayOfYear);
                System.out.println("\nDo you want to start over? [yes/no]");
                String res = scanner.nextLine();
                if (res.equalsIgnoreCase("no")) {
                    break;
                }
            } while (true);
        }
    }

    private static int getValidInput(Scanner scanner, int min, int max) {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
public static int dayOfYear(int month, int dayOfMonth, int year) {
        int dayOfYear = dayOfMonth;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }


        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        return dayOfYear;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}