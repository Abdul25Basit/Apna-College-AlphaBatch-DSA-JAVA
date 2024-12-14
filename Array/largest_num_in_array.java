import java.util.*;

public class largest_num_in_array {

    // Method to find the largest and smallest numbers in the array
    public static int largest_num(int num[]) {
        
        // Initialize largest to the smallest possible integer value (-Infinity)
        int largest = Integer.MIN_VALUE;

        // Initialize smallest to the largest possible integer value (+Infinity)
        int smallest = Integer.MAX_VALUE;

        // Loop through the array to compare each element
        for (int i = 0; i < num.length; i++) {

            // If the current number is larger than the largest found so far, update largest
            if (largest < num[i]) {
                largest = num[i];
            }

            // If the current number is smaller than the smallest found so far, update smallest
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }

        // Print the smallest number found in the array
        System.out.println("The Smallest number in the array is: " + smallest);

        // Return the largest number found in the array
        return largest;
    }

    // Main method to test the largest_num function
    public static void main(String args[]) {
        
        // Example array to test the function
        int num[] = {1, 3, 9, 4, 5, 7};

        // Print the largest number found in the array
        System.out.println("The largest number in the array is: " + largest_num(num));
    }
}
