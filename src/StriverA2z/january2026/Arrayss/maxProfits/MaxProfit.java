package StriverA2z.january2026.Arrayss.maxProfits;

class MaxProfit {
    public static void main(String[] args) {
        int[] prices =  {1,2,3,4,5};
        MaxProfit ob = new MaxProfit();
        int profit = ob.maxProfit(prices);
        System.out.println(profit);
    }
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}