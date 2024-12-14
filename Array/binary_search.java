import java.util.*;

public class binary_search {

    // Method for performing binary search
    public static int binary_search(int numbers[], int key) {
        
        // Define start and end pointers for the search range
        int start = 0;
        int end = numbers.length - 1;

        // Loop continues as long as the start pointer is less than or equal to the end pointer
        while (start <= end) {

            // Calculate the middle index of the current search range
            int mid = (start + end) / 2;

            // Check if the middle element is the key we are searching for
            if (numbers[mid] == key) {
                return mid;  // Return the index of the element if found
            }

            // If the middle element is less than the key, narrow the search range to the right half
            if (numbers[mid] < key) {
                start = mid + 1;  // Set the start pointer to mid + 1 to search the right half
            } else {
                // If the middle element is greater than the key, narrow the search range to the left half
                end = mid - 1;  // Set the end pointer to mid - 1 to search the left half
            }
        }

        // Return -1 if the key is not found in the array
        return -1;
    }

    // Main method to test the binary_search function
    public static void main(String args[]) {

        // Example array to search
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        
        // The element we are looking for
        int key = 4;

        // Call binary_search and print the result (the index of the key)
        System.out.println("Your key is at: " + binary_search(numbers, key));
    }
}
