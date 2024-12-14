public class optimises_bubbleSort {

    public static void bubbleSort(int array[]) {
        // Loop for each pass over the array
        for (int turn = 0; turn < array.length - 1; turn++) {

            // Flag to track if any swaps occurred
            boolean swapped = false;

            // Inner loop for comparing adjacent elements
            for (int i = 0; i < array.length - 1 - turn; i++) {

                // If elements are in the wrong order, swap them
                if (array[i] > array[i + 1]) {
                    // Swap the elements
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // Set swapped flag to true as swap occurred
                    swapped = true;
                }
            }

            // If no swaps occurred in the pass, the array is sorted, so break early
            if (swapped == false) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        // Initialize the array to be sorted
        int array[] = { 5, 3, 2, 1, 4 };

        // Call the optimized bubble sort method
        bubbleSort(array);

        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

Explanation of Key Sections:
Outer Loop (for (int turn = 0; turn < array.length - 1; turn++)):

This loop handles the multiple passes through the array. The variable turn keeps track of the number of passes, and the array.length - 1 ensures the array is processed correctly.
Inner Loop (for (int i = 0; i < array.length - 1 - turn; i++)):

The inner loop compares each pair of adjacent elements (array[i] and array[i + 1]) and swaps them if the left element is greater than the right one.
The array.length - 1 - turn ensures that the largest elements "bubble up" to the end with each pass, so the comparison size reduces with each iteration.
Swap Flag (boolean swapped = false):

The flag swapped checks if any swaps were made during the inner loop.
If no swaps are made, the array is considered sorted, and the outer loop terminates early using break.
Early Exit (if (swapped == false) { break; }):

If no swaps were made during the current pass, the array is already sorted, and the algorithm exits early, improving efficiency.
Sample Output:
For the input array {5, 3, 2, 1, 4}, the program will output:

Copy code
1 2 3 4 5 
Time Complexity:
Best Case: O(n) (when the array is already sorted, only one pass is needed, and no swaps occur).
Average Case: O(n^2) (for an unsorted array, the algorithm performs n-1 passes).
Worst Case: O(n^2) (when the array is in reverse order, requiring the maximum number of swaps).
Space Complexity:
O(1): The sorting is done in-place, meaning no additional space is used beyond the input array.
