package com.SeptemberArrived;

import java.util.Arrays;

class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] numbers = new int[2];
        int i = 0;
        int n = nums.length;

        while(i < n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        for(int j = 0 ; j < n ; j++){
            if(nums[j]-1 != j){ //checking if each element is equal to there correct place
                numbers[0] = nums[j]; //here we add the element which doesn't match the index or its correct place
                numbers[1] = j+1; //we find the actual number which is missing, and we add 1 because we know the actual,
                //number which should have been there will be 1 greater than the index containing the wrong number.
            }
        }
        return numbers;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};

        FindErrorNums ob = new FindErrorNums();
        int[] newArr = ob.findErrorNums(arr);
        System.out.println(Arrays.toString(newArr));
    }
}