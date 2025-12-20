package com.DailyProblems;

class MaximumProfit {
    public static void main(String[] args) {
        int[] prices = {};
        int k = 2;
        MaximumProfit ob = new MaximumProfit();
        long profit = ob.maximumProfit(prices,k);
        System.out.println(profit);
    }
    public long maximumProfit(int[] prices, int k) {
        long maxProfit = Integer.MIN_VALUE;
        long minProfit = Integer.MAX_VALUE;
        int costPrice;
        int sellingPrice;
        long totalProfit = 0;
        int transactions = k;

        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] < prices[i+1]){ //if price at current is greater than the previous day
                costPrice = prices[i-1]; //we will buy it in a price of previous day.
                for (int j = i+1; j < prices.length - 1; j++) {// we are starting from i +1 as we can't buy and sell on
                    //same day.
                    int profit = 0;
                    if(prices[j] > prices[j+1] && transactions < k){
                        profit = prices[j] - costPrice;
                        maxProfit = Math.max(maxProfit,profit);
                        minProfit = Math.min(minProfit,profit);
                        transactions++;
                    }
                    totalProfit += maxProfit;
                }
            }
        }


        return totalProfit;
    }
}