import java.util.*; // Import for Scanner class to take user input

public class matrix { // Class to demonstrate basic matrix operations

    public static void main(String args[]) {
        // Step 1: Declare a 3x3 matrix
        int matrix[][] = new int[3][3];

        // Get the number of rows (n) and columns (m) of the matrix
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns (assumes all rows have equal length)

        // Step 2: Initialize Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for the 3x3 matrix:");

        // Step 3: Input elements into the matrix
        for (int i = 0; i < n; i++) { // Loop through rows
            for (int j = 0; j < m; j++) { // Loop through columns
                matrix[i][j] = sc.nextInt(); // Read each element from user
            }
        }

        // Step 4: Print the matrix in a formatted way
        System.out.println("The entered matrix is:");
        for (int i = 0; i < n; i++) { // Loop through rows
            for (int j = 0; j < m; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " "); // Print each element with space
            }
            System.out.println(); // New line after each row
        }
    }
}
