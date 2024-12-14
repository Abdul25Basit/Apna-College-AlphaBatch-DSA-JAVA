public class ReverseArray {

    // Method to reverse the array
    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;

        // Loop until start is less than end
        while (start < end) {
            
            // Swapping the elements at start and end indices
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            
            // Move start forward and end backward
            start += 1;
            end -= 1;
        }
    }

    public static void main(String args[]) {

        // Initial array
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
    
        // Reverse the array
        reverse(numbers);
        
        // Print the reversed array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();  // To print a new line after array output
    }
}
