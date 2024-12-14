public class matrix_spiral_print {

    // Function to print the matrix in a spiral order
    public static void spiralPrint(int matrix[][]) {
        // Define the boundaries of the matrix
        int startRow = 0; // Starting row
        int startCol = 0; // Starting column
        int endRow = matrix.length - 1; // Ending row
        int endCol = matrix[0].length - 1; // Ending column

        // Loop until the entire matrix is traversed in spiral order
        while (startRow <= endRow && startCol <= endCol) {

            // 1. Print the top part (left to right on the current top row)
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            // 2. Print the right side (top to bottom on the current right column)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // 3. Print the bottom part (right to left on the current bottom row)
            for (int i = endCol - 1; i >= startCol; i--) {
                // Prevent re-printing if there's only one column left
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

            // 4. Print the left side (bottom to top on the current left column)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // Prevent re-printing if there's only one row left
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // Move the boundaries inward for the next layer
            startRow++;
            startCol++;
            endRow--;
            endCol--;

            // Print a newline for better readability of output
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Sample 5x5 matrix
        int matrix[][] = { 
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        // Call the function to print the matrix in spiral order
        spiralPrint(matrix);
    }
}


Explanation of Code Logic:
Boundary Variables:

startRow and startCol: Represent the top-left corner of the remaining sub-matrix.
endRow and endCol: Represent the bottom-right corner of the remaining sub-matrix.
These variables are updated inward after each spiral layer.
Traversal Steps:

Top Part: Print elements in the top row from startCol to endCol.
Right Part: Print elements in the rightmost column from startRow + 1 to endRow.
Bottom Part: Print elements in the bottom row from endCol - 1 to startCol (only if startRow != endRow).
Left Part: Print elements in the leftmost column from endRow - 1 to startRow + 1 (only if startCol != endCol).
Boundary Updates:

After printing one layer of the spiral, increment startRow and startCol and decrement endRow and endCol to move to the next inner layer.
Edge Cases:

Single row or column: Avoid re-printing the same elements by using conditions like if (startRow == endRow) and if (startCol == endCol).

