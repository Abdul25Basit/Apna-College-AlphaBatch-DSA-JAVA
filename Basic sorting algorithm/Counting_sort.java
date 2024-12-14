public class CountingSort {

    public static void counting_sort(int arr[]) {
        // Find the largest and smallest element in the array (for handling negative numbers)
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
            smallest = Math.min(smallest, arr[i]);
        }

        // If the array contains negative numbers, we need to shift them to positive indices
        int range = largest - smallest + 1;

        // Create a frequency count array for the range of values
        int count[] = new int[range];

        // Count the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - smallest]++; // Shift the elements to positive indices
        }

        // Reconstruct the sorted array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i + smallest; // Shift back to the original value
                count[i]--;
                j++;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        counting_sort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


Explanation of Changes:
Handling Negative Numbers:

I introduced a smallest variable to track the minimum element in the array.
If the array contains negative values, the range of the counting array will be shifted by subtracting smallest from each element. This ensures all values are shifted to non-negative indices.
Counting Sort Basics:

The count array stores the frequency of each element.
After counting, the elements are placed back in the original array in sorted order.
Sample Output:
For the input array {1, 4, 1, 3, 2, 4, 3, 7}, the output will be:

Copy code
1 1 2 3 3 4 4 7
Time Complexity:
Time Complexity: O(n + k), where n is the size of the input array and k is the range of the input (i.e., the difference between the largest and smallest values in the array). If the range of values is not very large, the time complexity is close to O(n).
Space Complexity: O(k), as the counting array stores the frequencies of elements in the range.
