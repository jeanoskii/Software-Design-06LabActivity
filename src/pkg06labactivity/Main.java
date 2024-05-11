/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06labactivity;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Year;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do {
            try {
                int dayOfYear = 0;
                System.out.println();
                System.out.println("!  Day of Year Application  !");
                System.out.println("Please enter a month: ");
                int month = s.nextInt();
                System.out.println("Please enter day of month: ");
                int dayOfMonth = s.nextInt();
                System.out.println("Please enter year: ");
                int year = s.nextInt();
                dayOfYear = dayOfYear(month, dayOfMonth, year);
                System.out.println("Day of year is " + dayOfYear);
                System.out.println();
            } catch(Exception e) {
                System.out.println("!!!");
                System.out.println("ERROR: Error occured while parsing input.");
                System.out.println("!!!");
            }
            s.nextLine();
            System.out.println("Do you want to start over? [y/n]");
            String res = s.nextLine();
            if(res.equalsIgnoreCase("n")) {
                break;
            }     
        } while (true);
    }
    
    // this function will return the day of year based on the input
    // month, day of month, and year.
    // for example, if the month is January, day of month is 5th of January,
    // and year is 2024. the output will be 5 (5th day of the year).
    // another example, if month is February, day of month is 23rd of February,
    // and year is 2023. the output will be 54 (54th day of the year).
    public static int dayOfYear(int month, int dayOfMonth, int year) {
        int daysInYear = 0;
        try {
            if (year < 1970 || year > Year.now().getValue()) {
                throw new IllegalArgumentException();
            }
            if (dayOfMonth < 1 || dayOfMonth > 31) {
                throw new IllegalArgumentException();
            }
            if (month < 1 || month > 12) {
                throw new IllegalArgumentException();
            }
            if (month == 1) {
                return dayOfMonth;
            }
            HashMap<Integer, Integer> calendar = new HashMap<>();
            calendar.put(1, 31);
            calendar.put(2, 28);
            calendar.put(3, 31);
            calendar.put(4, 30);
            calendar.put(5, 31);
            calendar.put(6, 30);
            calendar.put(7, 31);
            calendar.put(8, 31);
            calendar.put(9, 30);
            calendar.put(10, 31);
            calendar.put(11, 30);
            calendar.put(12, 31);
            for(int i = 1; i <= calendar.size(); i++) {
                if (i == month) {
                    daysInYear = daysInYear + dayOfMonth;
                    break;
                }
                daysInYear = daysInYear + calendar.get(i);
                if (year % 4 == 0) {
                    if (i == 2 && dayOfMonth > 28) {
                        daysInYear++;
                    }
                }
            }
        }
        catch(IllegalArgumentException iae) {
            System.out.println("!!!");
            System.out.println("ERROR: Error occured due to invalid or out of range input.");
            System.out.println("!!!");
        }
        return daysInYear;
    }
    
}
