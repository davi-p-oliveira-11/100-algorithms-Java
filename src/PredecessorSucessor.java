/* 
 6) Write a program that reads an integer and displays its predecessor and successor.  
Example:  
Enter a number: 9  
The predecessor of 9 is 8  
The successor of 9 is 10
 */


import java.util.Locale;
import java.util.Scanner;

public class PredecessorSucessor {

  public static void main(String[] args) {
    calculate();
  }

  static void calculate() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type a number: ");
    int num1 = scanner.nextInt();

    int predecessor = num1 - 1;
    int successor = num1 + 1;

    System.out.println("The predecessor of " + num1 + " is " + predecessor);
    System.out.println("The successor of " + num1 + " is " + successor);

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }
  
}
