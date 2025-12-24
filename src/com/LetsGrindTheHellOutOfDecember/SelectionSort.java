package com.LetsGrindTheHellOutOfDecember;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,34};
        SelectionSort ob = new SelectionSort();
        int[] sorted = ob.selectionsort(nums);
        int[] sortedBubble = ob.bubbleSort(nums);
        int[] sortedInsertion = ob.insertionSort(nums);
        System.out.println(Arrays.toString(sortedInsertion));
        System.out.println(Arrays.toString(sortedBubble));
        System.out.println(Arrays.toString(sorted));
    }

    private int[] insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
        return nums;
    }

    private int[] bubbleSort(int[] nums) {
        int n = nums.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 1; j < n-i-1; j++) {
                if(nums[j-1] > nums[j]){
                    swap(nums,j-1,j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return nums;
    }

    private int[] selectionsort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int last  = nums.length - 1 - i;
            int maxi = 0;
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j] > nums[maxi]){
                   maxi = j;
                }
            }
            if(maxi != last){
                swap(nums, last, maxi);
            }
        }
        return nums;
    }


    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
