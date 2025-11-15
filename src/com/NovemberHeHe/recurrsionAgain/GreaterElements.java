package com.NovemberHeHe.recurrsionAgain;

import java.util.Arrays;

public class GreaterElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,66,77,7,8,9,7,65,4,32,3,4,6,8,76,5,43,2,23,4,7,7,654,32,345,67};
        int k = 7;
        GreaterElements ob = new GreaterElements();
        int[] result = ob.greaterElements(nums, k, 0, 0);
        System.out.println(Arrays.toString(result));
    }

    private int[] greaterElements(int[] nums,int target, int i, int newIndex) {
        if(i == nums.length){
            return new int[newIndex];
        }
        if(nums[i] > target){
            int[] result = greaterElements(nums, target, i+1, newIndex+1);
            result[newIndex] = i;
            return result;
        }else{
            int[] result = greaterElements(nums, target, i+1, newIndex);
            return result;
        }
    }
}
