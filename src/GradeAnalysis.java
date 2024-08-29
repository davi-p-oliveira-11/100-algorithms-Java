/* 
19) Create an algorithm that reads a student's name and two grades, 
calculates their average, and displays it on the screen. 
In the end, analyze the average and show whether 
the student had good performance (if it was above the average of 7.0).
*/

import java.util.Locale;
import java.util.Scanner;

public class GradeAnalysis {

  public static void main(String[] args) {
    gradeAnalyse();
  }

  static void gradeAnalyse () {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Enter the grade for exam 1 :");
    double grade1 = scanner.nextDouble();

    System.out.print("Enter the grade for exam 2 :");
    double grade2 = scanner.nextDouble();

    double average = (grade1 + grade2) / 2;

    System.out.println("The average of the exams is equivalent to " + average);

    if (average >= 7) {
      System.out.println("Student Passed !");
    } else {
      System.out.println("Student Failed !");
    }


    System.out.println("Press Enter to exit...");
    scanner.nextLine(); 
    scanner.nextLine(); 
 
    scanner.close();

  }
  
}
