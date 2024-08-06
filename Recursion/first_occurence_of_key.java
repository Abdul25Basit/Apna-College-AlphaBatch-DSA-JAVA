public class FirstOccurrence {

    /**
     * Finds the index of the first occurrence of a given key in an integer array.
     *
     * @param arr The input integer array.
     * @param key The key to search for.
     * @return The index of the first occurrence of the key, or -1 if not found.
     */
    public static int firstOccurrence(int[] arr, int key) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                // Return the index if the key is found
                return i;
            }
        }
        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int index = firstOccurrence(arr, key);
        System.out.println(index); // Output: 4
    }
}
