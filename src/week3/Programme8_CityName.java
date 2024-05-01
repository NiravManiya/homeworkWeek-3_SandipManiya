package week3;

import java.util.Scanner;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class Programme8_CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("City: New York");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("City: London");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("City: Paris");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("City: Tokyo");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("City: Sydney");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("City: Rome");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
