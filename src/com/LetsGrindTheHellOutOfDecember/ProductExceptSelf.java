package com.LetsGrindTheHellOutOfDecember;

import java.util.Arrays;

class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ProductExceptSelf ob = new ProductExceptSelf();
        int[] result = ob.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
//        int[] prefix = new int[n];

        int prefixPro = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefixPro;
            prefixPro *= nums[i];
        }

        int postfixPro = 1;
        for (int i = n-1; i >= 0; i--) {
            answer[i] = answer[i] * postfixPro;
            postfixPro *= nums[i];
        }

        return answer;
    }
}