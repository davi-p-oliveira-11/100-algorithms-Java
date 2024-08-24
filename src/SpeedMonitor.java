/* 
17) Write a program that asks for the speed of a car. 
If it exceeds 80 km/h, display a message saying that the user has been fined. 
In this case, display the amount of the fine, charging R$5 for each km above the allowed speed.
*/

import java.util.Locale;
import java.util.Scanner;

public class SpeedMonitor {

  public static void main(String[] args) {
    speedCheck();
  }

  static void speedCheck() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("What is the speed reached by the car ?");
    int carSpeed = scanner.nextInt();

    int exceedingSpeed = carSpeed - 80;
    int fineValue  = exceedingSpeed * 5;

    if (carSpeed > 80) {
      System.out.println("The car reached a speed of " + carSpeed + "km/h exceeding " + exceedingSpeed + "km/h of ");
      System.out.println("the allowed speed. The driver will have to pay a fine of " + fineValue + "USD");
    } else {
      System.out.println("The driver did not exceed the speed limit, so they will not have to pay a fine.");
    }

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();
  }

}
  

