package com.NovemberHeHe.math;
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all
// the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]

import java.util.ArrayList;
import java.util.Arrays;

class ProductExceptSelf {
    //here we are creating a prefix array to hold prefix product values and suffix array to hold suffix product value
    //and then an output array to hold the productexceptself values.
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] output = new int[n];

        int prefixPro = 1;
        for (int i = 0; i < n ; i++) {
            prefix[i] = prefixPro;
            prefixPro *= nums[i];
        }

        int suffixPro = 1;
        for(int i = n - 1 ; i >= 0 ; i--){
            suffix[i] = suffixPro;
            suffixPro *= nums[i];
        }
        for (int i = 0; i < n; i++) {
            output[i] = prefix[i] * suffix[i];
        }
        return output;
    }

    public int[] productExceptSelf1(int[] nums){
        int n = nums.length;
        int[] output = new int[n];

        // we will first add the prefix product values to the output array.
        int prefixPro = 1;
        for(int i = 0 ; i < n ; i++){
            output[i] = prefixPro;//this holds the prefix product values
            prefixPro *= nums[i];
        }

        //now, as we have prefix product values inside or output array, we just have to find the suffix values for the
        //elements of the nums array and then find their product with there respective indexed element in the output
        //array.
        int suffixPro = 1;
        for(int i = n - 1; i >= 0 ; i--){
            output[i] = output[i] * suffixPro;
            suffixPro *= nums[i];
        }

        return  output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ProductExceptSelf ob = new ProductExceptSelf();
        int[] answer = ob.productExceptSelf(nums);
        System.out.println(Arrays.toString(answer));

        int[] answer1 = ob.productExceptSelf1(nums);
        System.out.println(Arrays.toString(answer1));
    }
}