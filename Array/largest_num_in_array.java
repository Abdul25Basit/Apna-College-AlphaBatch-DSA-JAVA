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





        Detailed Explanation:
largest_num Method:

This method takes an integer array num[] and finds both the largest and smallest elements in it.
Initialization:

largest is initialized to Integer.MIN_VALUE, which represents the smallest possible value in Java (essentially negative infinity). This ensures that any number in the array will be greater than the initial value.
smallest is initialized to Integer.MAX_VALUE, which represents the largest possible value in Java (essentially positive infinity). This ensures that any number in the array will be smaller than the initial value.
Loop to Traverse the Array:

The for loop iterates through each element in the array.
Finding the Largest Number: Inside the loop, if the current element num[i] is greater than the current largest, then we update the value of largest.
Finding the Smallest Number: Similarly, if the current element num[i] is smaller than the current smallest, then we update the value of smallest.
Printing the Smallest Number:

After the loop finishes, we print the smallest number found using System.out.println.
Returning the Largest Number:

The method returns the largest number found after the loop finishes checking all elements.
Main Method:

The main method is where the program execution starts.
An example array num[] = {1, 3, 9, 4, 5, 7} is defined.
The largest_num method is called, and both the smallest and largest numbers are printed.
Output of the Code:
For the input array {1, 3, 9, 4, 5, 7}, the output will be:

c
Copy code
The Smallest number in the array is: 1
The largest number in the array is: 9
Time Complexity:
O(n): We traverse the entire array once, so the time complexity is linear, where n is the length of the array.
Space Complexity:
O(1): The space complexity is constant because we only use a fixed number of variables (for largest, smallest, and the loop counter) regardless of the input size.

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
