package week3;
// Write a Java program to calculate the average value of array elements
public class Programme19_ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        double sum = 0;

        // Calculate the sum of array elements
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = sum / numbers.length;

        System.out.println("Average of the array elements: " + average);
    }
}
