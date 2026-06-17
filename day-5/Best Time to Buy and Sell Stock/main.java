class Solution {
    public int maxProfit(int[] prices) {
        int pricesLength = prices.length;
        int profit = 0, maxProfit = 0;
        int minVal = prices[0];
        int i;
        for (i = 0; i < pricesLength; i++) {
            minVal = Math.min(minVal, prices[i]);
            profit = prices[i] - minVal;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}