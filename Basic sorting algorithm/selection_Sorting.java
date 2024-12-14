public class selection_Sorting {

    // Method for performing Selection Sort
    public static void sort(int array []){

        // Outer loop for each pass through the array
        for (int i = 0; i < array.length-1; i++) {

            // Assume the minimum element is the first unsorted element
            int minPosition = i;

            // Inner loop to find the smallest element in the unsorted part of the array
            for (int j = i+1; j < array.length; j++) {
                
                // Check if the current element is smaller than the element at minPosition
                if (array[minPosition] > array[j]) {

                    // Update minPosition if a smaller element is found
                    minPosition = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }

    // Main method to test the Selection Sort
    public static void main(String args []){
        
        // Initialize the array to be sorted
        int array [] =  {5,4,1,3,2,9,8,7,6,0};

        // Call the sort method to perform Selection Sort
        sort(array);

        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}



Explanation of Key Sections:
Outer Loop (for (int i = 0; i < array.length-1; i++)):

This loop iterates over the array and sets the current position i as the starting point for each unsorted part of the array.
Inner Loop (for (int j = i+1; j < array.length; j++)):

The inner loop finds the minimum element in the unsorted portion of the array (starting from position i+1).
If an element smaller than the current minimum (array[minPosition]) is found, it updates minPosition to the index of that smaller element.
Swapping (int temp = array[minPosition]; array[minPosition] = array[i]; array[i] = temp;):

After the inner loop finishes and the minimum element is found, it is swapped with the element at the current position i in the outer loop.
Reverse Sorting:

To change the sorting order to descending, simply replace the condition array[minPosition] > array[j] with array[minPosition] < array[j] in the inner loop. This will select the largest element instead of the smallest.
Sample Output:
For the input array {5, 4, 1, 3, 2, 9, 8, 7, 6, 0}, the program will output:

Copy code
0 1 2 3 4 5 6 7 8 9 
Time Complexity:
Best Case: O(n^2) (selection sort always performs n-1 comparisons, regardless of the array's initial state).
Average Case: O(n^2) (the algorithm performs the same number of comparisons).
Worst Case: O(n^2) (selection sort performs the same number of comparisons in all cases).
