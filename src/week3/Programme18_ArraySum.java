package week3;
//Write a Java program to sum values of an array.
public class Programme18_ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}
