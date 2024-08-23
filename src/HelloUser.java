/* 
 Write a program that reads a person's name and displays a welcome message for them:
Example:
What is your name? João da Silva
Hello John, it's a pleasure to meet you!
*/

import java.util.Scanner;
import java.util.Locale;

public class HelloUser {

  public static void main(String[] args) {
    SayHelloToUser();
  }

  static void SayHelloToUser() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("What's your name ?");
    String userName = scanner.next();

    System.out.println("Hello " + userName + " nice to meet you");

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }
  
}
