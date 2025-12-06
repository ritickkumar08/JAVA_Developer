package com.LetsGrindTheHellOutOfDecember.hehe;

import java.util.Arrays;

class MinCosts {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,3,2};
        MinCosts ob = new MinCosts();
        int[] ans = ob.minCosts(arr);
        System.out.println(Arrays.toString(ans));
    }
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] ans = new int[n];

        int minSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minSoFar = Math.min(minSoFar,cost[i]);
            ans[i] = minSoFar;
        }

        return ans;
    }
}