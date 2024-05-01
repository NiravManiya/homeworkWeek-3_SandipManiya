package week3;

import java.util.Scanner;
/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
 */
public class Programme5_SalarySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String empId = scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double HRA = basicSalary * 0.10;
        double TA = basicSalary * 0.09;
        double DA = basicSalary * 0.08;
        double PF = basicSalary * 0.20;
        double grossSalary = basicSalary + HRA + TA + DA - PF;

        System.out.println("_______________________________");
        System.out.println("| Salary Slip |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id : " + empId + " |");
        System.out.println("| Employee Name : " + empName + " |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary : " + basicSalary + " |");
        System.out.println("| HRA 10% : " + HRA + " |");
        System.out.println("| TA 9% : " + TA + " |");
        System.out.println("| DA 8% : " + DA + " |");
        System.out.println("| PF - 20% : " + PF + " |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary : " + grossSalary + " |");
        System.out.println("|===========================|");

        scanner.close();
    }
}
