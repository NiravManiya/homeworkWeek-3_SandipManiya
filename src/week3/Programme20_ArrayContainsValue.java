package week3;
//Write a Java program to test if an array contains a specific value
public class Programme20_ArrayContainsValue {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int targetValue = 30;
        boolean found = false;

        // Iterate through the array to check if it contains the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
