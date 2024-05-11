/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06labactivity;

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
        boolean loop = true;
        boolean tryagain;

        do {
            Scanner s = new Scanner(System.in);
            System.out.println();
            System.out.println("!  Day of Year Application  !");
            System.out.println("Please enter a month: ");
            String month = s.nextLine();
            System.out.println("Please enter day of month: ");
            String dayOfMonth = s.nextLine();
            System.out.println("Please enter year: ");
            String year = s.nextLine();

            int dayOfYear = dayOfYear(Integer.parseInt(month),
                    Integer.parseInt(dayOfMonth), Integer.parseInt(year));

            System.out.println("Day of year is " + dayOfYear);
            System.out.println();

            do {
                System.out.println("Do you want to start over? [y/n]");
                String res = s.nextLine();
                if (res.equalsIgnoreCase("y")) {
                    loop = true;
                    tryagain = false;
                } else if (res.equalsIgnoreCase("n")) {
                    loop = false;
                    break;
                } else {
                    tryagain = true;
                }
            } while (tryagain);
        } while (loop);
    } // this function will return the day of year based on the input
    // month, day of month, and year.
    // for example, if the month is January, day of month is 5th of January,
    // and year is 2024. the output will be 5 (5th day of the year).
    // another example, if month is February, day of month is 23rd of February,
    // and year is 2023. the output will be 54 (54th day of the year).

    public static int dayOfYear(int month, int dayOfMonth, int year) {
        boolean isLeapyear = (year % 4 == 0) && (year % 100 != 0);
        switch (month) {
            case 2:
                dayOfMonth += 31;
                break;
            case 3:
                dayOfMonth += 31 + 28;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 4:
                dayOfMonth += 31 + 28 + 31;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 5:
                dayOfMonth += 31 + 28 + 31 + 30;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 6:
                dayOfMonth += 31 + 28 + 31 + 30 + 31;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 7:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 8:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 9:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 10:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 11:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 12:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            case 13:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                if(isLeapyear){
                    dayOfMonth++;
                }
                break;
            default:
                break;
        }
        System.out.println("");
        if (isLeapyear) {
            System.out.println(year + " is a leapyear.");
        } else {
            System.out.println(year + " is not leapyear.");
        }
        return dayOfMonth;
    }
}
