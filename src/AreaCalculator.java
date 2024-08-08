/*
 Write an algorithm that reads the width and height of a wall,
  calculates and displays the area to be painted,
   and the amount of paint needed for the job, 
   knowing that each liter of paint covers an area of 2 square meters.
 */

import java.util.Locale;
import java.util.Scanner;

public class AreaCalculator {

  public static void main(String[] args) {
    calculateArea();
  }

  static void calculateArea() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   
    System.out.print("Enter the height of the wall in meters: ");
    double height = scanner.nextDouble();

    System.out.print("Enter the width of the wall in meters: ");
    double width = scanner.nextDouble();

    double area = width * height;
    double paintNeeded =  area * 0.5;

    System.out.println("The area of the wall to be painted is " + area + " m² ");
    System.out.println("and the amount of ink needed is " + paintNeeded + " liters");

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();
  }
  
}
