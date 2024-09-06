/*
 21) Write an algorithm that reads a specific year 
     and shows whether it is a LEAP YEAR or not."
 */

import java.util.Locale;
import java.util.Scanner;

public class LeapOrNot {
   
   public static void main(String[] args) {
     algorithm();
   }

   static void algorithm() {

     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
     System.out.print("Type a year: ");
     int year = scanner.nextInt();

     if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
       System.out.println(year + " is leap");
     } else {
       System.out.println(year + " is not leap");
     }

     System.out.println("Press Enter to exit...");
     scanner.nextLine(); 
     scanner.nextLine(); 
 
     scanner.close();

   }
}
