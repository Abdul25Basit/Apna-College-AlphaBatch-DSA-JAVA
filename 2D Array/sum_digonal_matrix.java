public class sum_digonal_matrix {

    // Brute Force Approach
    // Time complexity: O(n^2)
    public static void sum_digolans(int matrix[][]) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // Fix: Use `j < n` instead of `j <= n`
                // Primary diagonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                // Secondary diagonal
                if (i + j == n - 1) {
                    // Avoid double counting if it's the center of an odd-dimensioned matrix
                    if (i != j) {
                        sum += matrix[i][j];
                    }
                }
            }
        }

        System.out.println("Sum using brute force: " + sum);
    }

    // Optimized Solution
    // Time complexity: O(n)
    public static void sum_digonal(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal
            sum += matrix[i][i];
            // Add secondary diagonal, avoid double counting for center in odd-sized matrices
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }
        }

        System.out.println("Sum using optimized approach: " + sum);
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        sum_digolans(matrix); // Brute-force approach
        sum_digonal(matrix);  // Optimized approach
    }
}
