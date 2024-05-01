package week3;

import java.util.Scanner;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
public class Programme7_SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sales Id: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double commission = calculateCommission(salesAmount);
        double totalSalary = basicSalary + commission;

        System.out.println("_________________________________");
        System.out.println("| Sales Commission Details |");
        System.out.println("|_______________________________|");
        System.out.println("| Sales Id: " + salesId + " |");
        System.out.println("| Seller's Name: " + sellerName + " |");
        System.out.println("|_______________________________|");
        System.out.println("| Sales Amount: " + salesAmount + " |");
        System.out.println("| Basic Salary: " + basicSalary + " |");
        System.out.println("|_______________________________|");
        System.out.println("| Commission: " + commission + " |");
        System.out.println("| Total Salary: " + totalSalary + " |");
        System.out.println("|===============================|");

        scanner.close();
    }

    public static double calculateCommission(double salesAmount) {
        double commissionRate;
        if (salesAmount >= 50000)
            commissionRate = 0.35;
        else if (salesAmount >= 30000)
            commissionRate = 0.20;
        else if (salesAmount >= 20000)
            commissionRate = 0.10;
        else if (salesAmount >= 10000)
            commissionRate = 0.05;
        else
            commissionRate = 0.02;

        return salesAmount * commissionRate;
    }
}
