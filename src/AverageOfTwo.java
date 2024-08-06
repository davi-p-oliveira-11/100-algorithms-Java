/*
5) Create a program that reads the two grades of a student in a subject and displays their average for the subject.
Example:
Grade 1: 4.5
Grade 2: 8.5
The average of 4.5 and 8.5 is 6.5.
*/

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageOfTwo {

  public static void main(String[] args) {
    calculateAverage();
  }

  static void calculateAverage() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Enter the first grade: ");
    double grade1 = scanner.nextDouble();

    System.out.print("Enter the second grade: ");
    double grade2 = scanner.nextDouble();

    double average = (grade1 + grade2) / 2;

    // Format the number to one decimal place
    DecimalFormat df = new DecimalFormat("#.0");
    String formattedString = df.format(average);
    double formattedAverage = Double.parseDouble(formattedString);

    System.out.println("The average between " + grade1 + " and " + grade2 + " is: " +  formattedAverage);

    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    
    scanner.close();

  }
  
}
