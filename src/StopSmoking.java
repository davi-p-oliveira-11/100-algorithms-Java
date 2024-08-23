/* 
16) [CHALLENGE] Write a program to calculate the reduction in a smoker's lifespan. 
Ask for the number of cigarettes smoked per day and how many years they have been smoking. 
Consider that a smoker loses 10 minutes of life for each cigarette. 
Calculate how many days of life a smoker will lose and display the total in days.
*/


import java.util.Locale;
import java.util.Scanner;

public class StopSmoking {

  public static void main(String[] args) {
    calculate();
  }

  static void calculate() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("How many cigarretes do you smoke per day ? ");
    int cigarettesPerDay = scanner.nextInt();

    System.out.print("How many years have you been smoking ? ");
    int yearsSmoking = scanner.nextInt();

    int totalCigarsSmoked = cigarettesPerDay * 365 * yearsSmoking;
    int minutesLost = totalCigarsSmoked * 10;
    int daysLost = minutesLost / 1440;

    System.out.println("You have alreadt lost " + daysLost + " days of you life !");


    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }
  
}
