/* 
41) Develop a program that shows the following count:
100 95 90 85 80 ... 0 It's over !
*/

import java.util.Locale;
import java.util.Scanner;

public class Count0to100 {

  public static void main(String[] args) {
    algorithm();
  }

  static void algorithm() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int counter = 100;

    while(counter >= 0) {
      System.out.println(counter);
      counter -= 5;
    }

    System.out.println("It's over !");

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();

  }

}
