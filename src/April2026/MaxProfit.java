package April2026;

class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};

        MaxProfit ob = new MaxProfit();
        int profit = ob.maxProfit(prices);
        System.out.println(profit);
    }
    public int maxProfit(int[] prices) {
        // Code here
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
           minPrice = Math.min(minPrice, prices[i]);
           int profit = prices[i] - minPrice;

           maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}