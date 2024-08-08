/*
 7) Create an algorithm that reads a real number and displays its double and one-third.  
Example:  
Enter a number: 3.5  
The double of 3.5 is 7.0  
One-third of 3.5 is 1.16666
 */

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class DoubleThird {

  public static void main(String[] args) {
    calculate();
  }

  static void calculate() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type a number: ");
    double num1 = scanner.nextDouble();

    double twice = num1 * 2;
    double thirdPart = num1 / 3;
    
    // format the numbers
    DecimalFormat df = new DecimalFormat("#.00");
    String formattedString = df.format(twice);
    double formattedDouble = Double.parseDouble(formattedString);

    DecimalFormat df2 = new DecimalFormat("#.00");
    String formattedString2 = df2.format(thirdPart);
    double formattedDouble2 = Double.parseDouble(formattedString2);

    System.out.println("The double of " + num1 + " is " + formattedDouble);
    System.out.println("The third part of " + num1 + " is " + formattedDouble2);

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();
  
  }
  
}
