package pkg06labactivity;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Knight John Dumaguete and Jake Leandro Saren
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
        
        
        if (month == 2) {
                 dayOfMonth += 31;
           
        }else if (year % 4 == 0){
            if(year % 4 == 0){
                dayOfMonth += 29;
            }   
  
        }    
        else if (month == 3) {
            dayOfMonth += 59;
        
        } else if (month == 4) {
            dayOfMonth += 90;
        } else if (month == 5) {
            dayOfMonth += 120;
        } else if (month == 6) {
            dayOfMonth += 151;
        } else if (month == 7) {
            dayOfMonth += 181;
        } else if (month == 8) {
            dayOfMonth += 212;
        } else if (month == 9) {
            dayOfMonth += 243;
        } else if (month == 10) {
            dayOfMonth += 273;
        } else if (month == 11) {
            dayOfMonth += 304;
        } else if (month == 12) {
            dayOfMonth += 335;
        }
        return dayOfMonth;
    }
}
   

