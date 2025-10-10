package com.SeptemberArrived;

//Given an integer array nums and an integer k, return the kth largest element in the array.
//
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
//Can you solve it without sorting?


import java.util.Arrays;

class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for(int i = 1 ; i < n ; i++){
            int j = i;

            while(j > 0 && nums[j] < nums[j-1]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));

        return nums[n-k];
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 3;

        FindKthLargest ob = new FindKthLargest();
        int number = ob.findKthLargest(arr,k);
        System.out.println(number);

    }
}