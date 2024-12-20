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
                }
            }

            System.out.println();  // New line to separate subarrays for clarity
        }

        // Print the maximum sum of any subarray found
        System.out.println("Max sum of an array is : " + maxSum);
    }

    // Main method to test the Max_subarray method
    public static void main(String args[]) {

        // Example array to test the function
        int num[] = {1, 2, 3, 4, 5};

        // Call the Max_subarray function to find the maximum subarray sum
        Max_subarray(num);
    }
}





Detailed Explanation:
Max_subarray Method:

The purpose of this method is to find the maximum sum of any subarray in the given array using a brute force approach.
Initialization:

currentSum: This variable stores the sum of the elements in the current subarray that we are checking.
maxSum: This variable stores the maximum subarray sum found so far. It is initialized to Integer.MIN_VALUE to ensure any sum encountered will be greater than this initial value.
Outer Loop (Choosing Starting Point):

The outer loop (for (int i = 0; i < num.length; i++)) iterates over each index in the array, which is used as the starting index of the subarray.
Inner Loop (Choosing Ending Point):

The inner loop (for (int j = i; j < num.length; j++)) iterates over each index starting from i and going to the end of the array. This is used to choose the ending index of the subarray.
Sum Calculation:

For each pair of start and end indices, we calculate the sum of the subarray by iterating from start to end using another loop (for (int k = start; k <= end; k++)).
The sum of the current subarray is stored in currentSum, and the current subarray is printed along with its sum.
Max Sum Comparison:

After calculating the sum of the current subarray, we compare it with the current maxSum. If currentSum is greater than maxSum, we update maxSum.
Final Output:

After all subarrays have been checked, the maxSum is printed, which is the maximum sum of any subarray found.
Example Walkthrough:
For the array {1, 2, 3, 4, 5}, the subarrays generated by the brute force approach are:

Subarrays starting from index 0:

{1}, Sum: 1
{1, 2}, Sum: 3
{1, 2, 3}, Sum: 6
{1, 2, 3, 4}, Sum: 10
{1, 2, 3, 4, 5}, Sum: 15
Subarrays starting from index 1:

{2}, Sum: 2
{2, 3}, Sum: 5
{2, 3, 4}, Sum: 9
{2, 3, 4, 5}, Sum: 14
Subarrays starting from index 2:

{3}, Sum: 3
{3, 4}, Sum: 7
{3, 4, 5}, Sum: 12
Subarrays starting from index 3:

{4}, Sum: 4
{4, 5}, Sum: 9
Subarrays starting from index 4:

{5}, Sum: 5
The maximum sum of any subarray is 15, which corresponds to the subarray {1, 2, 3, 4, 5}.
