package com.SeptemberArrived;

import java.util.Arrays;

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]- 1;
            //as we have to ignore negative values that is why we are only checking for the smallest
            //positive number, and we know that the missing number can be the length of the array.
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j]-1 != j){
                return j + 1;
            }
        }
        return nums.length + 1; //when the missing number is out of the length of the array.
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0};

        FirstMissingPositive ob = new FirstMissingPositive();
        int number = ob.firstMissingPositive(arr);
        System.out.println(number);
    }
}