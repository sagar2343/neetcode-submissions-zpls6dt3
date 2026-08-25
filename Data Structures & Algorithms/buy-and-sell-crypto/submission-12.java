class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int profit = 0;

        for (int i=1; i<prices.length; i++) {
            bestBuy = Math.min(bestBuy, prices[i]);
            profit = Math.max(profit, prices[i] - bestBuy);
        }
        return profit;
        
    }
}
