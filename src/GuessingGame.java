/*
 32) [CHALLENGE] Create a game where the computer will randomly choose a number 
 between 1 and 5 and the player will try to guess which number was chosen.
*/

/* Algorithm:
 1- ask the user to insert a number
  1.1 - store it in a variable
 2 -  Make the computer randomly chose a number
  2.1 - store it in a variable
 3 - Check if the numbers are equal
  3.1 if it is true the player wins
  3.2 otherwise the player loses
*/

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

  public static void main(String[] args) {
    algorithm();
  }

  public static void algorithm() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Random random = new Random();

    System.out.print("Enter a number: ");
    int playerNumber = scanner.nextInt();

    int computerNumber = random.nextInt(5) + 1;

    System.out.println("Player choice was " + playerNumber);
    System.out.println("Computer choice was " + computerNumber);

    if (playerNumber == computerNumber) {
      System.out.println("Congratulations you won !");
    } else {
      System.out.println("You Lose !");
    }

    
    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();
    
  }

}
