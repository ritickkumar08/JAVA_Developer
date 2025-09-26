package com.August;
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]

import java.util.ArrayList;

public class FindAllNumbersMissing {
    public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        while(i < n){
            int correct = nums[i] - 1 ;
            if(nums[i] != nums[correct]){ //here we do check with the correct element because we want to find the correct
                //index where the existing number should be swapped.
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0 ; j < n ; j++){
            if((nums[j] - 1) != j){ //checking if the number in the index is correct or nor and if not adding it to the
                //list. here we are doing the element - 1 because the number starts with 1 and the missing number index
                //will be occupied by a wrong number.
                list.add(j + 1); //we are adding the number j + 1 because the index will be 1 lesser than the number
                //which are found missing.
            }
        }
        return list;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp ;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        FindAllNumbersMissing ob = new FindAllNumbersMissing();
        ArrayList<Integer> list = ob.findDisappearedNumbers(arr);
        System.out.println(list);
    }
}
