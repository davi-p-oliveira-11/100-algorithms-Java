/*
 39) Create an algorithm that displays the following count on the screen:
10 9 8 7 6 5 4 3 Done!
*/


import java.util.Locale;
import java.util.Scanner;

public class Count10to3 {

  public static void main(String[] args) {
    algorithm();
  }

  static void algorithm() {
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int counter = 10;

    while (counter >= 3) {
      System.out.println(counter);
      counter--;
    }

    System.out.println("It's over !");

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();
  }

}
