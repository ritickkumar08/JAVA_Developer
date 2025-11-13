package com.NovemberHeHe.subArray;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray ob = new MaximumSubarray();
        System.out.println(ob.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        int n = nums.length;
        int i = 1;

        while(i < n){
            if(sum < 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            i++;

            maxSum = Math.max(sum , maxSum);
        }
        return maxSum;
    }
}
