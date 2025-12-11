package com.LetsGrindTheHellOutOfDecember.newL.removeDuplicates;

import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3};
        Optimal ob = new Optimal();
        int[] k = ob.removeDuplicates(arr);
        System.out.println(Arrays.toString(k));
    }
    public int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2) return nums;
        
        int k = 2;
        for (int i = 2; i < n; i++) {
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return nums;
    }
}
