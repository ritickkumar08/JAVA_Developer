package com.NovemberHeHe.math;

import java.util.Arrays;

class LeftRightDifference {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            output[i] = prefixSum;
            prefixSum += nums[i];
        }

        int suffixSum = 0;
        for(int i = n-1 ; i >=0 ; i--){
            output[i] = Math.abs(output[i] - suffixSum);
            suffixSum += nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        LeftRightDifference ob = new LeftRightDifference();
        System.out.println(Arrays.toString(ob.leftRightDifference(nums)));
    }
}