/* 
18) Write a program that reads a person's year of birth, 
calculates their age, and then shows whether they are eligible to vote or not.
*/

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;


public class CanYouVote {

  public static void main(String[] args) {
    checkAge();
  }

  static void checkAge() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("What is your year of birth ? ");
    int yearOfBirth = scanner.nextInt();

    int currentYear = LocalDate.now().getYear();

    int userAge = currentYear - yearOfBirth;

    if (userAge >= 16) {
      System.out.println("You are already eligible to vote.");
    } else {
      System.out.println("You are not old enough to vote yet.");
    }

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();

  }
  
}
