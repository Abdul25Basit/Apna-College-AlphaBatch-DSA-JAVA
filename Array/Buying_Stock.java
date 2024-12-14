public class Buying_Stock {

    // Method to calculate the maximum profit from stock prices
    public static int BuyAndSellStock(int prices[]) {

        int buyPrice = Integer.MAX_VALUE; // Initially set to maximum possible value
        int maxProfit = 0;  // Initially, the maximum profit is zero

        // Iterate through each day's price
        for (int i = 0; i < prices.length; i++) {

            // If current price is higher than the buy price, calculate the profit
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;

                // Update the maximum profit if this profit is greater
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Update the buy price if we encounter a lower price
                buyPrice = prices[i];
            }
        }

        return maxProfit; // Return the maximum profit found
    }

    public static void main(String args[]) {
        // Stock prices for each day
        int prices[] = {7, 1, 5, 3, 6, 4};

        // Call the BuyAndSellStock method and print the result (maximum profit)
        System.out.print(BuyAndSellStock(prices));
    }
}
