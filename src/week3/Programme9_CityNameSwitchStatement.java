package week3;

import java.util.Scanner;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
*using switch statement
 */

public class Programme9_CityNameSwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        switch(alphabet) {
            case 'A':
            case 'a':
                System.out.println("City: New York");
                break;
            case 'B':
            case 'b':
                System.out.println("City: London");
                break;
            case 'C':
            case 'c':
                System.out.println("City: Paris");
                break;
            case 'D':
            case 'd':
                System.out.println("City: Tokyo");
                break;
            case 'E':
            case 'e':
                System.out.println("City: Sydney");
                break;
            case 'F':
            case 'f':
                System.out.println("City: Rome");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
