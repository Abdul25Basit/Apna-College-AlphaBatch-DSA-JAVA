public class staircase_search_sortted_arr {

    // Staircase search starting from the upper-right corner
    public static boolean staircase_Search_upperRight(int matrix[][], int key) {
        // Start at the top-right corner
        int row = 0, col = matrix[0].length - 1;

        // Loop until we either find the key or move out of bounds
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                // Move left if the key is smaller
                col--;
            } else {
                // Move down if the key is larger
                row++;
            }
        }

        // If we exit the loop, the key is not present
        System.out.println("Key is not present in MATRIX");
        return false;
    }

    // Staircase search starting from the bottom-left corner
    public static boolean staircase_Search_bottomLeft(int matrix[][], int key) {
        // Start at the bottom-left corner
        int row = matrix.length - 1, col = 0;

        // Loop until we either find the key or move out of bounds
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                // Move up if the key is smaller
                row--;
            } else {
                // Move right if the key is larger
                col++;
            }
        }

        // If we exit the loop, the key is not present
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String args[]) {
        // Sample sorted matrix
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        // Key to search
        int key = 40;

        // Call the bottom-left staircase search
        staircase_Search_bottomLeft(matrix, key);

        // Optional: Call the upper-right staircase search
        // staircase_Search_upperRight(matrix, key);
    }
}
