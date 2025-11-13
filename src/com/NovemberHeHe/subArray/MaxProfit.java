package com.NovemberHeHe.subArray;

import javax.management.remote.rmi.RMIJRMPServerImpl;

class MaxProfit {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        MaxProfit ob = new MaxProfit();
        System.out.println(ob.maxProfit(nums));
    }
    public int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE;
       int maxProfit = 0;

       for(int price : prices){
           if(price < minPrice){
               minPrice = price;
           }else if(price - minPrice > maxProfit){
               maxProfit = price - minPrice;
           }
       }
       return maxProfit;
    }
}