public class max_subarray_sum_kadanes_algorithm {

    // Kadane's algorithm to find the maximum subarray sum
    public static void kadanes(int num[]) {

        // currSum keeps track of the sum of the current subarray
        int currSum = 0;

        // maxSum keeps track of the maximum sum encountered so far
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value

        // Loop through each element in the array
        for (int i = 0; i < num.length; i++) {

            // Add the current element to the current sum
            currSum = currSum + num[i];

            // If the current sum becomes negative, reset it to 0
            // because continuing with a negative sum won't give a better result
            if (currSum < 0) {
                currSum = 0;
            }

            // Update maxSum if the current sum is greater than the previously recorded maxSum
            maxSum = Math.max(currSum, maxSum);

            // Print the current maxSum at each step (for debugging or visualization purposes)
            System.out.println(maxSum);
        }

        // After the loop ends, print the maximum sum found
        System.out.println("Max sum is : " + maxSum);
    }

    // Main method to test Kadane's algorithm
    public static void main(String args[]) {

        // Example array with both negative and positive numbers
        int num[] = {-1, -2, -3, 4};

        // Call Kadane's algorithm method
        kadanes(num);
    }
}



Explanation of the Code:
Initialization:

currSum: This variable tracks the sum of the current subarray. It starts at 0.
maxSum: This variable holds the highest sum encountered so far. It is initialized to Integer.MIN_VALUE to ensure any sum we encounter will be larger than this.
Loop:

The loop runs through each element of the array. At each step, the current element is added to currSum.
If currSum becomes negative, we reset it to 0 because any negative sum will not help in maximizing the subarray sum. Kadane's algorithm works by discarding negative-sum subarrays, as starting fresh from the next element may yield a higher sum.
Update maxSum:

After updating currSum, we update maxSum if currSum is greater than the previously recorded maximum sum.
Output:

The algorithm prints the maximum sum found so far after every iteration.
At the end of the loop, the final maxSum is printed, which is the maximum subarray sum.
Example Walkthrough:
For the input array { -1, -2, -3, 4 }:

Iteration 1 (i = 0):

currSum = -1 (Adding num[0] = -1)
Since currSum < 0, reset currSum = 0
maxSum = max(0, Integer.MIN_VALUE) = 0
Print: 0
Iteration 2 (i = 1):

currSum = -2 (Adding num[1] = -2)
Since currSum < 0, reset currSum = 0
maxSum = max(0, 0) = 0
Print: 0
Iteration 3 (i = 2):

currSum = -3 (Adding num[2] = -3)
Since currSum < 0, reset currSum = 0
maxSum = max(0, 0) = 0
Print: 0
Iteration 4 (i = 3):

currSum = 4 (Adding num[3] = 4)
maxSum = max(4, 0) = 4
Print: 4
After the loop completes, the final maximum sum (maxSum) is 4.
