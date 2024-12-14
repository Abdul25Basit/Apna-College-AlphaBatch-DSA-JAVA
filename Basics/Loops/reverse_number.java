public class reverse_number { // Class to reverse the digits of a number
    public static void main(String args[]) {

        // Step 1: Initialize the number to be reversed
        int num = 546783; // The original number that we want to reverse

        // Step 2: Loop until all digits are processed
        while (num > 0) {
            // Step 3: Extract the last digit of the number
            int lastdigit = num % 10; // 'num % 10' gives the remainder, which is the last digit of 'num'

            // Step 4: Print the last digit
            System.out.print(lastdigit); // Outputs the digit without moving to the next line

            // Step 5: Remove the last digit from the number
            num /= 10; // Integer division by 10 drops the last digit from 'num'
        }

        // When the loop ends, all digits of the number have been printed in reverse order
    }
}
