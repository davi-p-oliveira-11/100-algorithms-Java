

import java.util.Scanner;
import java.util.Locale;

public class SumOfTwo {

  public static void main(String[] args) {
    calculate();
  }

  static void calculate() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type a number: ");
    int num1 = scanner.nextInt();

    System.out.print("Type another number: ");
    int num2 = scanner.nextInt();

    int sum = num1 + num2;

    System.out.println("The sum between " + num1 + " and " + num2 + " is equal to " + sum);

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }
  
}
