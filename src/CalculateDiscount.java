/*
 Create a program that reads the price of a product, 
 calculates, and displays its DISCOUNTED PRICE, with a 5% discount.
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculateDiscount {

  public static void main(String[] args) {
     Calculate();
  }

  static void Calculate() {

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.print("Enter the value of the product: ");
       double productPrice = scanner.nextDouble();

       double discount = productPrice * 0.05;
       double finalPrice = productPrice - discount;

       System.out.println("The price of the product with the discount is: " + finalPrice);         
       
       System.out.println("Press Enter to exit...");
       scanner.nextLine(); 
       scanner.nextLine(); 
    
       scanner.close();

    }
  
}
