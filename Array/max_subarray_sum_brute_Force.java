public class max_subarray_sum_brute_Force {

    // Method to find the maximum subarray sum using brute force
    public static void Max_subarray(int num[]) {

        int currentSum;  // To store the sum of the current subarray
        int maxSum = Integer.MIN_VALUE;  // Initialize maxSum to the smallest possible value (negative infinity)

        // Outer loop to choose the starting point of the subarray
        for (int i = 0; i < num.length; i++) {

            int start = i;  // The starting index of the subarray
            
            // Inner loop to choose the ending point of the subarray
            for (int j = i; j < num.length; j++) {

                int end = j;  // The ending index of the subarray
                currentSum = 0;  // Reset currentSum for each subarray
               
                // Loop through the elements in the subarray from start to end and calculate their sum
                for (int k = start; k <= end; k++) {
                    currentSum += num[k];  // Add the current element to currentSum
                    System.out.print(num[k] + "      ");  // Print the current element in the subarray
                }
                
                // Print the sum of the current subarray
                System.out.print("Sum of array is : " + currentSum);
                System.out.println();  // New line for the next subarray

                // Compare current sum with the max sum found so far
                if (currentSum > maxSum) {
                    maxSum = currentSum;  // Update maxSum if the current sum is greater
              
