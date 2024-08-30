/* 
 38) Write a program that displays the following count on the screen: 6 7 8 9 10 11 Done!
 */
import java.util.Locale;
import java.util.Scanner;

public class Count6to11 {

  public static void main(String[] args) {
    algorithm();
  }

  static void algorithm() {
     
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int counter = 6;

    while (counter <= 11) {
      System.out.println(counter);
      counter++;
    }

    System.out.println("It's over !");

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();
   }

}


