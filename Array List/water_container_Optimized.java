import java.util.*;

public class WaterContainerOptimized {

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
        System.out.println(capacity(bars));
    }

    // This method calculates the maximum water capacity between bars
    // using the two-pointer technique.
    public static int capacity(ArrayList<Integer> bars) {

        // Initialize two pointers:
        // `leftP` starts from the first bar (leftmost bar).
        // `rightP` starts from the last bar (rightmost bar).
        int leftP = 0;
        int rightP = bars.size() - 1;

        // `maxWater` keeps track of the maximum amount of water
        // that can be stored between two bars as we move the pointers.
        int maxWater = 0;

        // Loop until the two pointers meet
        while (leftP < rightP) {

            // Calculate the height of the container formed by the two bars:
            // The height of the container is determined by the shorter bar.
            int height = Math.min(bars.get(leftP), bars.get(rightP));

            // Calculate the width of the container: distance between the two bars.
            int width = rightP - leftP;

            // Calculate the water trapped between the two bars and update `maxWater`
            // Water is the height of the container multiplied by its width.
            int water = height * width;
            maxWater = Math.max(water, maxWater);  // Keep the maximum value

            // Move the pointers:
            // If the left bar is shorter, move the left pointer to the right.
            // If the right bar is shorter, move the right pointer to the left.
            // This is done to potentially find a taller bar that might increase the water capacity.
            if (bars.get(leftP) < bars.get(rightP)) {
                leftP++;  // Move the left pointer to the right
            } else {
                rightP--;  // Move the right pointer to the left
            }
        }

        // Return the maximum water capacity found
        return maxWater;
    }
}
