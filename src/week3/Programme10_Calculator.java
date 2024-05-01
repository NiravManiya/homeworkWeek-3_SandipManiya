package week3;

import java.util.Scanner;
//Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)

public class Programme10_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 8;
        double num2 = 2;

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        if(operation == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if(operation == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if(operation == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if(operation == '/') {
            if(num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operation symbol.");
        }
    }
}
