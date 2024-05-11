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
        do {
            Scanner s = new Scanner(System.in);

            System.out.println("!  Day of Year Application  !");
            System.out.println("Please enter a month (enter its number instead of the name): ");
            int month = s.nextInt();
            System.out.println("Please enter day of month: ");
            int dayOfMonth = s.nextInt();
            System.out.println("Please enter year: ");
            int year = s.nextInt();
            
            int dayOfYear = dayOfYear(month, dayOfMonth, year);

            System.out.println("Day of year is " + dayOfYear);
            System.out.println();
            
            System.out.println("Do you want to start over? [y/n]");
            char res = s.next().charAt(0);
            if(res == 'n') {
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
        switch (month) {
            case 1:
                dayOfMonth += 0;
                break;
            case 2:
                dayOfMonth += 31;
                break;
            case 3:
                dayOfMonth += 31 + 28;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 4:
                dayOfMonth += 31 + 28 + 31;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 5:
                dayOfMonth += 31 + 28 + 31 + 30;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 6:
                dayOfMonth += 31 + 28 + 31 + 30 + 31;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 7:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 8:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 9:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 10:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 11:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
            case 12:
                dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                if(year %4 == 0){
                    dayOfMonth += 1;
                }
                break;
        }
        
        return dayOfMonth;
        
    }
    
}
