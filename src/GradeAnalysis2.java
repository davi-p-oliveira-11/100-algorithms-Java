/* 
 27) Write a program that calculates a student's average grade from two scores 
 and displays a message based on that average:

Below 5.0: "Failed"
5.0 to 6.9: "Needs Improvement" (OR "Recovery Course Required")
7.0 or higher: "Passed"
*/

import java.util.Locale;
import java.util.Scanner;

public class GradeAnalysis2 {

  public static void main(String[] args) {
    algorithm();
  }

  static void algorithm() {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Type the grade for the first test: ");
    double grade1 = scanner.nextDouble();

    System.out.print("Type the grade for the second test: ");
    double grade2 = scanner.nextDouble();

    double average = (grade1 + grade2) / 2;

    if (average <= 4.9) {
      System.out.println("The student scored an average of " + average + " and Failed !");
    } else if (average >= 5 && average <= 6.9) {
      System.out.println("The student scored an average of " + average + " and need to do the final exam !");
    } else {
      System.out.println("The student scored an average of " + average + " and Passed !");
    }


    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();
  }
  
}
