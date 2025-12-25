package com.LetsGrindTheHellOutOfDecember.Recurssion;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,66,7,76,5,4,3,4};
        QuickSort2 ob = new QuickSort2();
        ob.quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private void quickSort(int[] nums, int low, int high) {
        if( low>= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }
            if(start <= end){
                swap(nums,start, end);
                start++;
                end--;
            }
        }

        if(low < end) quickSort(nums, low, end);
        if(start < high) quickSort(nums, start, high);
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
