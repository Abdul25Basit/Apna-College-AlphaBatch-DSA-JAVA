public class insert_sorting {

    public static void sort(int array[]){

        int n = array.length;

        // Run loop n-1 times because the last element will be automatically sorted
        // Also, start the loop from 1 because the first element is already considered sorted
        for(int i = 1; i < n; i++){
            int current = array[i];  // The element to be inserted
            int previous = i - 1;    // The previous element index to compare with

            // Finding out the correct position to insert
            while(previous >= 0 && array[previous] > current){
                array[previous + 1] = array[previous];  // Shift elements to the right
                previous--;  // Move the index left
            }

            // Insertion: place the current element in the correct position
            array[previous + 1] = current;

            // Print the array after each insertion to visualize progress
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.print("------");
        }
    }

    public static void main(String args []){

        // Initialize the array to be sorted
        int array[] = {1, 2, 3, 5, 4};
        
        // Print the initial array
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.print("------");

        // Call the sort method to sort the array
        sort(array);
    }
}
