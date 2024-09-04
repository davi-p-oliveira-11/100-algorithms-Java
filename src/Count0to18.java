/* 
40) Write a program that writes on the screen the following count:
0 3 6 9 12 15 18 It's over !
*/


import java.util.Locale;
import java.util.Scanner;

public class Count0to18 {

  public static void main(String[] args) {
    algorithm();
  }

  static void algorithm() {
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int counter = 0;

    while(counter <= 18) {
      System.out.println(counter);
      counter += 3;
    }

    System.out.println("It's over !");

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();
  }

}
