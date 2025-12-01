package com.LetsGrindTheHellOutOfDecember.Recurssion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,8,9};
        QuickSort ob = new QuickSort();
        ob.sort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end){
            //also a reason why if it's already sorted it will not swap.
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        //now as the pivot is at its correct index, lets sort the two halves now
        if (low < end) sort(arr, low, end);
        if (start < high) sort(arr, start, high);
    }
}
