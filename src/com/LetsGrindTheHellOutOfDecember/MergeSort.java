package com.LetsGrindTheHellOutOfDecember;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,76,87,9,11,23};
        MergeSort ob = new MergeSort();
        int[] sorted = ob.mergeSort(nums);
        System.out.println(Arrays.toString(sorted));
    }

    private int[] mergeSort(int[] nums) {
         if(nums.length <= 1){
             return nums;
         }

         int mid = nums.length/2;

         int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
         int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

         return merge(left,right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                sorted[k++] = left[i++];
            }else {
                sorted[k++] = right[j++];
            }
        }
        while(i < left.length){
            sorted[k++] = left[i++];
        }
        while (j < right.length){
            sorted[k++] = right[j++];
        }

        return sorted;
    }
}
