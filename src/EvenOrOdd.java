/* 
20) Develop a program that reads an integer and shows whether it is EVEN or ODD."
*/

import java.util.Locale;
import java.util.Scanner;

public class EvenOrOdd {

  public static void main(String[] args) {
    checkEvenOrOdd();
  }

  static void checkEvenOrOdd() {
     
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type a number: ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("Even number.");
    } else {
      System.out.println("Odd number");
    }


    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();
  }
  
}
