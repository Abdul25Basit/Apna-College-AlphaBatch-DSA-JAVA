public class DSA_Rainwater_Trapping {

    // Method to calculate the trapped rainwater
    public static int trappedRainWater(int bars[] ){
        int n = bars.length;

        // Step 1: Calculate left max boundary (leftMax[] array)
        int leftMax[] = new int[n];
        leftMax[0] = bars[0]; // The first bar has no bars to the left, so it is its own left boundary
        
        // Fill the leftMax array
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(bars[i], leftMax[i-1]);
        }
        
        // Step 2: Calculate right max boundary (rightMax[] array)
        int rightMax[] = new int[n];
        rightMax[n-1] = bars[n-1]; // The last bar has no bars to the right, so it is its own right boundary
        
        // Fill the rightMax array
        for(int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(bars[i], rightMax[i+1]);
        }
        
        // Step 3: Calculate the trapped rainwater
        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            // Water level is determined by the minimum of the left and right boundaries
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            // The trapped water at index i is the difference between the water level and the bar height
            trappedWater += waterLevel - bars[i];
        }
        
        return trappedWater; // Return the total trapped rainwater
    }

    public static void main(String args[]) {
        // Sample input: heights of bars
        int bars[] = {4, 2, 0, 6, 3, 2, 5};
        
        // Call the trappedRainWater method and print the result
        System.out.println(trappedRainWater(bars)); // Expected Output: 11
    }
}

