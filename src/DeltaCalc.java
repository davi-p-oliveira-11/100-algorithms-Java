/* 
11)  "Develop a logic that reads the values of A, B, and C 
from a quadratic equation and shows the value of Delta.
 */

import java.util.Locale;
import java.util.Scanner;

public class DeltaCalc {
   
  public static void main(String[] args) {
    CalculateDelta();
  }

  static void CalculateDelta() {
       
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type the value of A: " );
    int valueA = scanner.nextInt();

    System.out.print("Type the value of B: " );
    int valueB = scanner.nextInt();

    System.out.print("Type the value of C: " );
    int valueC = scanner.nextInt();

    int delta = (valueB * valueB) - 4 * (valueA * valueC);

    System.out.println("The value of delta is equal to " + delta);

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }

}