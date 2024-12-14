public class pairs_in_arrays {

    // Method to print all pairs in the array
    public static void pairs(int num[]) {
        int tp = 0; // Initialize total pairs counter

        // Outer loop to iterate over each element of the array
        for (int i = 0; i < num.length; i++) {
             
            int current = num[i]; // Store the current element
            
            // Inner loop to form pairs with the current element and the subsequent elements
            for (int j = i + 1; j < num.length; j++) {
                // Print the current pair (current element, paired element)
                System.out.print("(" + current + "," + num[j] + ") ");
                tp++; // Increment the pair counter
            }
            // Print a newline after printing all pairs for the current element
            System.out.println();
        }

        // After processing all pairs, print the total number of pairs
        System.out.println("Total no. of pairs are = " + tp);
    }

    // Main method
    public static void main(String args[]) {
        // Example array with numbers
        int num[] = { 2, 3, 4, 5, 6};

        // Calculate the total number of pairs using the formula n * (n - 1) / 2, where n is the size of the array
        int n = num.length;
        System.out.println("Total no. of pairs (calculated formula): " + (n * (n - 1)) / 2 + "\n");

        // Call the pairs method to print pairs
        pairs(num);
    }
}
