package com.weAreNowInOctober.ThreeSome;
//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is
//closest to target. Return the sum of the three integers.
//
//You may assume that each input would have exactly one solution.
//
//Example 1:
//
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

import java.util.Arrays;

class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int minSum = Integer.MAX_VALUE; //initialising the minimum difference of sum for three elements of the array
        //as maximum value of integer.
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0 ; i < n-2 ; i++ ){
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(target - sum) < Math.abs(target - minSum)) {
                        minSum = sum; //checking if the sum of newly pointed three elements is lesser than that of
                        //previous three pointed elements.
                    }
                    if(sum == target) return sum; //if we happen to get a sum which is equal to the target we simply
                    //return the value at that point.
                    else if(sum > target) k--; //if the sum is greater than that of the target element a smaller
                    //value can be found by pointing to a lesser value for k.
                    else j++;//else if the sum is smaller than that of the target value a closure value can be found
                    //towards the right of the j.
            }
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        ThreeSumClosest ob = new ThreeSumClosest();
        int result = ob.threeSumClosest(arr,target);
        System.out.println(result);
    }
}