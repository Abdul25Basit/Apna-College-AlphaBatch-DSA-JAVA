public class RainWaterTrapping {

    // Method to calculate trapped rainwater
    public static void trappedRainwater(int height[]) {

        int n = height.length;
        
        // Arrays to store the left and right max height at each position
        int leftB[] = new int[n];
        int rightB[] = new int[n];
        
        // Calculate left max boundaries for each bar
        leftB[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftB[i] = Math.max(height[i], leftB[i - 1]);
        }

        // Calculate right max boundaries for each bar
        rightB[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightB[i] = Math.max(height[i], rightB[i + 1]);
        }
        
        // Calculate the trapped rainwater
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // The trapped water at each bar is determined by the water level
            // which is the minimum of the left and right max boundaries minus the height of the bar
            int waterLevel = Math.min(leftB[i], rightB[i]);
            trappedWater += Math.max(0, waterLevel - height[i]);  // Only positive values of trapped water are considered
        }

        // Output the result
        System.out.println("Trapped rainwater: " + trappedWater);
    }

    // Main method to test the functionality
    public static void main(String args[]) {
        // Example height array representing bars of varying heights
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        
        // Call the method to calculate and print the trapped rainwater
        trappedRainwater(height);
    }
}




Explanation:
Left and Right Maximum Boundaries:

We calculate the left maximum boundary (leftB) and right maximum boundary (rightB) for each index:
leftB[i] will hold the maximum height from the left up to index i.
rightB[i] will hold the maximum height from the right up to index i.
Trapped Water Calculation:

For each index i, the trapped water is the difference between the minimum of the leftB[i] and rightB[i] (which represents the water level) and the height at that index height[i].
If the water level is higher than the bar height, there will be trapped water. Otherwise, there is no trapped water at that position.
Result:

The total trapped rainwater is accumulated in the variable trappedWater.
Expected Output:
For the input height array {4, 2, 0, 6, 3, 2, 5}, the trapped rainwater calculation will output:

yaml
Copy code
Trapped rainwater: 11
This means there are 11 units of rainwater trapped between the bars.
