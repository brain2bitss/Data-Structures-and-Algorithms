class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Track the lowest price so far
        int maxProfit = 0;                 // Track the maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;          // Update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // Update max profit
            }
        }

        return maxProfit;
    }
}