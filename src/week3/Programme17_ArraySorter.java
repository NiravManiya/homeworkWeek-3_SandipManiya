package week3;

import java.util.Arrays;
//Write a Java program to sort a numeric array and a string array.
public class Programme17_ArraySorter {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 9, 1, 6, 3};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"banana", "apple", "orange", "grape", "kiwi"};
        System.out.println("Original string array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}
