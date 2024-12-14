public class passing_array_as_argument {

    // Method to update the array elements and an integer (non-changeable)
    public static void update_array(int marks[], int nonChangeable) {
        
        // Attempt to modify the non-changeable integer (This won't affect the original value in main)
        nonChangeable += 10;

        // Loop through the array and increment each element by 1
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // Increment each element of the array by 1
        }
    }

    // Main method to test the functionality
    public static void main(String args[]) {
        
        // Initialize an array with some values
        int marks[] = {97, 98, 99};

        // Initialize an integer that will not be modified outside the method (non-changeable)
        int nonChangeable = 5;

        // Call the method that modifies the array and attempts to modify the non-changeable integer
        update_array(marks, nonChangeable);

        // Print the updated values of the array
        System.out.print(marks[0] + " ");
        System.out.print(marks[1] + " ");
        System.out.println(marks[2] + " \n");

        // Print the value of nonChangeable (this will remain unchanged outside the method)
        System.out.print(nonChangeable);
    }
}
