/*
 13) Write an algorithm that reads an employee's salary, calculates, 
 and displays their new salary with a 15% increase.
 */

import java.util.Locale;
import java.util.Scanner;

public class SalaryRaise {
 
  public static void main(String[] args) {
    calculateRaise();
  }

  static void calculateRaise() {
     
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("What is the value of your salary ? ");
    double salaryValue = scanner.nextDouble();

    double calculate15 = salaryValue * 0.15;
    double newSalary = salaryValue + calculate15;

    System.out.println("Your new Salary with a raise of 15% is: " + newSalary);

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();
  }
  
}
