package week3;

import java.util.Scanner;

public class Programme3_MarkSheet {
/*
 Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input student details
    System.out.print("Enter student name: ");
    String name = scanner.nextLine();

    System.out.print("Enter roll number: ");
    int rollNo = scanner.nextInt();

    // Input marks for each subject
    System.out.println("Enter marks for Math, Science, and English (out of 100):");
    int mathMarks = inputMarks(scanner, "Math");
    int scienceMarks = inputMarks(scanner, "Science");
    int englishMarks = inputMarks(scanner, "English");

    // Calculate total marks and percentage
    int totalMarks = mathMarks + scienceMarks + englishMarks;
    double percentage = (totalMarks / 3.0);

    // Determine result and grade
    String result = (percentage >= 35) ? "Pass" : "Fail";
    String grade = calculateGrade(percentage);

    // Print Mark Sheet
    System.out.println("_______________________________");
    System.out.println("|                            |");
    System.out.println("|          Mark Sheet        |");
    System.out.println("|____________________________|");
    System.out.println("| Name      : " + name);
    System.out.println("| Roll No   : " + rollNo);
    System.out.println("|____________________________|");
    System.out.println("| Subjects  : Marks          |");
    System.out.println("|____________________________|");
    System.out.println("| Math      : " + mathMarks);
    System.out.println("| Science   : " + scienceMarks);
    System.out.println("| English   : " + englishMarks);
    System.out.println("|____________________________|");
    System.out.println("| Total     : " + totalMarks);
    System.out.println("|____________________________|");
    System.out.println("| Percentage: " + percentage);
    System.out.println("| Result    : " + result);
    System.out.println("| Grade     : " + grade);
    System.out.println("|____________________________|");

    scanner.close();
}

    // Method to input marks for a subject (with validation)
    private static int inputMarks(Scanner scanner, String subject) {
        int marks;
        do {
            System.out.print("Enter marks for " + subject + ": ");
            marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

    // Method to calculate grade based on percentage
    private static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
