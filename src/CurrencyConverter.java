/*
9) Write an algorithm that reads how much money a person 
has in their wallet (in BRL) and shows how many US dollars 
they can buy. Consider 1 USD = 3.45 BRL.
 */

 
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {

  public static void main(String[] args) {
    convert();
  }

  static void convert() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("How many brl do you have in your wallet ? ");
    double brl = scanner.nextDouble();

    double dollars = brl / 3.45;

    System.out.println("You can buy: " + dollars + " USD");

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();
    
  }
  
}
