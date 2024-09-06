/*
26) Write an algorithm that reads two integers and compares them, displaying
one of the following messages on the screen:
- The first value is greater
- The second value is greater
- There is no greater value, both are equal
*/

import java.util.Locale;
import java.util.Scanner;

public class CompareNumbers {

  public static void main(String[] args) {
    algorithm();
  }

  static void algorithm() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type a number: ");
    int num1 = scanner.nextInt();

    System.out.print("Type another number: ");
    int num2 = scanner.nextInt();

    if (num1 > num2) {
      System.out.println("The first value is greater");
    } else if (num1 < num2) {
      System.out.println("The second value is greater");
    } else if (num1 == num2) {
      System.out.println("There is no greater value, both are equal");
    }

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();

  }

}
