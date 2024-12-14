import java.util.*; // Import for using Scanner for input

public class element_search { // Class to perform element search and find largest/smallest values in a matrix

    // Method to search for a key in the matrix
    public static boolean search(int matrix[][], int key) {
        // Iterate through each row
        for (int i = 0; i < matrix.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < matrix[0].length; j++) {
                // Check if the current element matches the key
                if (matrix[i][j] == key) {
                    System.out.println("We found the key at: " + "[" + i + "]" + "[" + j + "]");
                    return true; // Exit as soon as the key is found
                }
            }
        }
        // If key is not found after scanning the entire matrix
        return false;
    }

    // Method to find the largest and smallest elements in the matrix
    public static void largest_smallest(int matrix[][]) {
        // Initialize variables to track largest and smallest values
        int largest = Integer.MIN_VALUE; // Smallest possible integer
        int smallest = Integer.MAX_VALUE; // Largest possible integer

        // Traverse through the entire matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Update largest and smallest values using Math functions
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }

        // Print the results
        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: " + smallest);
    }

    public static void main(String args[]) {
        // Initialize a 3x3 matrix
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in); // Scanner for user input

        // Step 1: Input elements for the matrix
        System.out.println("Enter elements for the 3x3 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt(); // Read element
            }
        }

        // Step 2: Print the matrix in a readable format
        System.out.println("The entered matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // New line after each row
        }

        // Step 3: Search for the key (example: 7)
        int key = 7;
        boolean isFound = search(matrix, key);
        if (!isFound) {
            System.out.println("Key not found in the matrix.");
        }

        // Step 4: Find the largest and smallest elements in the matrix
        largest_smallest(matrix);
    }
}
