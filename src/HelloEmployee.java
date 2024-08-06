/* 
Create a program that reads the name and salary of an employee, and displays a message at the end. 
Example: Employee's Name: Maria do Carmo
Salary: 1850.45
The employee Maria do Carmo has a salary of R$1850.45 in June.
 */

import java.util.Scanner;
import java.util.Locale;

public class HelloEmployee {

  public static void main(String[] args) {
    sayHelloEmployee();
  }

  static void sayHelloEmployee () {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type the Employee name: ");
    String employee = scanner.next();

    System.out.print("Type the employee salary: ");
    String salary = scanner.next();

    System.out.print("Type the last month worked: ");
    String month = scanner.next();

    System.out.println("The employee " + employee + " has a salary of " + salary + " in " + month);
    
    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }

}

