/*
 14) The car rental company needs your help to charge for its services. Write
 a program that asks for the number of kilometers driven by a rented car and the
 number of days it was rented. Calculate the total amount to be paid,
 knowing that the car costs $90 per day and $0.20 per kilometer driven.
*/

import java.util.Locale;
import java.util.Scanner;

public class RentalCalc {

  public static void main(String[] args) {
    calculateRent();
  }

  static void calculateRent() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("How many kilometers were traveled with the car ?");
    double distanceTraveled = scanner.nextDouble();

    System.out.print("For how many days were the car rented ? ");
    double daysRented = scanner.nextDouble();

    double costPerDay = daysRented * 90;
    double costPerDistance = distanceTraveled * 0.20;

    double totalCost = costPerDay + costPerDistance;

    System.out.println("The customer ran " + distanceTraveled + " km with the car");
    System.out.println("alugou o carro por "+ daysRented + " days that costed" );
    System.out.println(+ costPerDay + " USD for the days rented and");
    System.out.println(+ costPerDistance + " USD for the distance traveled, ");
    System.out.println("The total price that the client must pay is " + totalCost + " USD");


    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }
  
}
