/* 
 15) Create a program that reads the number of days worked in a month and shows the salary of an employee, 
 knowing that they work 8 hours per day and earn $25 per hour worked.
*/

import java.util.Locale;
import java.util.Scanner;

public class KnowYourSalary {

  public static void main(String[] args) {
    calculateSalary();
  }

  static void calculateSalary() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("How many days did you work last month ? ");
    int daysWorked = scanner.nextInt();

    int salary = daysWorked * 200;

    System.out.println("The employee worked for " + daysWorked + " days and will receive " + salary + " USD.");


    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }
  
}
