package week3;

import java.util.Scanner;

public class Programme6_OddEvenIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The input number is even.");
        } else {
            System.out.println("The input number is odd.");
        }
    }
}
