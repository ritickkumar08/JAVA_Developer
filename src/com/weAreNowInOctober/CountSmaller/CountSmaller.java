package com.weAreNowInOctober.CountSmaller;
//Given an integer array nums, return an integer array counts where counts[i] is the number of smaller
//elements to the right of nums[i].
//Example 1:
//
//Input: nums = [5,2,6,1]
//Output: [2,1,1,0]
//Explanation:
//To the right of 5 there are 2 smaller elements (2 and 1).
//To the right of 2 there is only 1 smaller element (1).
//To the right of 6 there is 1 smaller element (1).
//To the right of 1 there is 0 smaller element.


import java.util.ArrayList;
import java.util.List;

class CountSmaller {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>(); //to store the array of counts.
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j =i + 1 ; j < nums.length ;j++){
                if(nums[i] > nums[j]) {
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,6,1};
        CountSmaller ob = new CountSmaller();
        List<Integer> list = ob.countSmaller(arr);
        System.out.println(list);
    }
}