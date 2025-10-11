package com.weAreNowInOctober.sortByParity;

import java.util.Arrays;

class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int j = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(isEven(nums[i])){
                swap(nums,i,j);
                j++;
            }
        }

        return nums;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    private boolean isEven(int num) {
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        SortArrayByParity ob = new SortArrayByParity();
        int[] result = ob.sortArrayByParity(arr);
        System.out.println(Arrays.toString(result));
    }
}