/*
8) Develop a program that reads a distance in meters and shows the corresponding values in other units.
Example:
Enter a distance in meters: 185.72
The distance of 185.7m corresponds to:
0.18572 Km  
1.8572 Hm  
18.572 Dam  
1857.2 dm  
18572.0 cm  
185720.0 mm
 */


import java.util.Locale;
import java.util.Scanner;

public class MeasureConverter {
  public static void main(String[] args) {
    calculate();
  }

  static void calculate() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type a measure in meters: ");
    double meters = scanner.nextDouble();

    double kilometers = meters / 1000;
    double hectometers = meters / 100;
    double decameters = meters /   10;
    double decimeters = meters *   10;
    double centimeters = meters * 100;
    double milimeters = meters * 1000;

    String kmFormatted= String.format("%.2f", kilometers);
    String hmFormatted = String.format("%.2f", hectometers);
    String damFormatted = String.format("%.2f", decameters);
    String dmFormatted = String.format("%.2f", decimeters);
    String cmFormatted = String.format("%.2f", centimeters);
    String mmFormatted = String.format("%.2f", milimeters);

    System.out.println("A distancia em de " + meters + " equivale a\n" 
        + kmFormatted + " km\n"
        + hmFormatted + " hm\n"
        + damFormatted + " dam\n"
        + dmFormatted + " dm\n"
        + cmFormatted + " cm\n"
        + mmFormatted + " mm\n");

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }
}
