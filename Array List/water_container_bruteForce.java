import java.util.*;

public class WaterContainerBruteForce {

    public static void main(String args[]) {
        // Initialize the list of bars (heights of the bars)
        ArrayList<Integer> bars = new ArrayList<>();

        // Adding sample bars (height of the bars)
        bars.add(1);   // Bar at index 0
        bars.add(8);   // Bar at index 1
        bars.add(6);   // Bar at index 2
        bars.add(2);   // Bar at index 3
        bars.add(5);   // Bar at index 4
        bars.add(4);   // Bar at index 5
        bars.add(8);   // Bar at index 6
        bars.add(3);   // Bar at index 7
        bars.add(7);   // Bar at index 8

        // Call the method to calculate maximum water capacity
        System.out.println(water(bars));
    }

    // This method calculates the maximum water capacity using the brute force approach.
    public static int water(ArrayList<Integer> bar) {

        // Variable to keep track of the maximum water capacity found
        int maxWater = Integer.MIN_VALUE;

        // Iterate through every possible pair of bars
        for (int i = 0; i < bar.size(); i++) {
            for (int j = i + 1; j < bar.size(); j++) {

                // Find the height of the container formed by the two bars
                int conHeight = Math.min(bar.get(i), bar.get(j));

                // Find the width of the container (distance between the two bars)
                int conLength = j - i;

                // Calculate the water capacity for this pair of bars
                int water = conHeight * conLength;

                // Update maxWater if this pair of bars holds more water
                maxWater = Math.max(maxWater, water);
            }
        }

        // Return the maximum water capacity found
        return maxWater;
    }
}
