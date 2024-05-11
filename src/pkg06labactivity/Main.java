package pkg06labactivity;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("PLEASE follow date format MM/DD/YYYY");
            System.out.println("!  Day of Year Application  !");
            System.out.println("Please enter a month: ");
            String month = s.nextLine();
            System.out.println("Please enter day of month: ");
            String dayOfMonth = s.nextLine();
            System.out.println("Please enter year: ");
            String year = s.nextLine();

            int dayOfYear = dayOfYear(Integer.parseInt(month),
                    Integer.parseInt(dayOfMonth), Integer.parseInt(year));
            int YearNow = (Integer.parseInt(year));

            System.out.print("Today is the day " + dayOfYear + " of the year " + year + " ");
                //for leap years or not leap years
                if (YearNow%4 == 0) {
                    System.out.print("out of 366 days of the year");
                }
                else {
                    System.out.print("out of 365 days of the year");
                }
            System.out.println();
            
            System.out.println("Do you want to start over? [y/n]");
            String res = s.nextLine();
            if(res.equalsIgnoreCase("n")) {
                break;
            }     
        } while (true);
    }

     public static int dayOfYear(int month, int dayOfMonth, int year) {
        switch (month) {
            case 2 ->  dayOfMonth += 31;
            case 3 ->  dayOfMonth += 59;
            case 4 ->  dayOfMonth += 90;
            case 5 ->  dayOfMonth += 120;
            case 6 ->  dayOfMonth += 151;
            case 7 ->  dayOfMonth += 181;
            case 8 ->  dayOfMonth += 212;
            case 9 ->  dayOfMonth += 243;
            case 10 -> dayOfMonth += 273;
            case 11 -> dayOfMonth += 304;
            case 12 -> dayOfMonth += 335;
            default -> {
            }
        }
        return dayOfMonth;
    }
    
}
    

