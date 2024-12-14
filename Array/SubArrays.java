import java.util.*;

public class SubArrays {

    // Method to print all possible subarrays
    public static void SubArray(int num[]) {

        // Outer loop to fix the starting index of the subarray
        for (int i = 0; i < num.length; i++) {

            int start = i;

            // Inner loop to fix the ending index of the subarray
            for (int j = i; j < num.length; j++) {
                int end = j;

                // Innermost loop to print the elements of the subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " "); // Print each element in the subarray
                }
                System.out.println(); // Print a newline after each subarray
            }
            System.out.println(); // Print a newline after each starting index
        }
    }

    // Main method to test the SubArray method
    public static void main(String args[]) {

        // Example array to find all subarrays
        int num[] = {2, 4, 6, 8, 10};

        // Call the SubArray method to print subarrays
        SubArray(num);

        // Calculate the total number of subarrays using the formula n * (n + 1) / 2
        int n = num.length;
        int ts = (n * (n + 1)) / 2;

        // Print the total number of subarrays
        System.out.println("Total sub array = " + ts);
    }
}
