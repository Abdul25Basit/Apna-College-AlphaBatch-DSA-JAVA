public class SubArraySum {

    // Method to calculate and print all subarrays and their sums
    public static void subarray_sum(int num[]) {
        
        // Outer loop to select the starting index of subarray
        for (int i = 0; i < num.length; i++) {
            int sum = 0; // Sum of the current subarray

            // Inner loop to select the ending index of subarray
            for (int j = i; j < num.length; j++) {
                
                // Print the current element of the subarray
                System.out.print(num[j] + "   ");
                
                // Add the current element to sum
                sum += num[j];
            }

            // Print the sum of the current subarray
            System.out.println("Sum of this Subarray : " + sum);
        }
    }

    public static void main(String args[]) {
        // Test array
        int num[] = { 1, 2, 3, 4, 5 };

        // Call the method to print subarrays and their sums
        subarray_sum(num);

        // Calculate and print the total number of subarrays
        int n = num.length;
        System.out.println("Total number of subarrays = " + (n * (n + 1)) / 2);
    }
}
