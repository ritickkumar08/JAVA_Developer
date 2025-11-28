package com.NovemberHeHe.recurrsionAgain.Sorts;

import java.sql.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,2,3,4,5,66,5,43,2,3,45,43,2,34,5,43,2,45,43,4,5,43,45,4,3};
        MergeSort ob = new MergeSort();
        int[] result = ob.mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }

    private int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left,right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                sorted[k++] = left[i++];
            } else {
                sorted[k++] = right[j++];
            }
        }
        while(i < left.length){
            sorted[k++] = left[i++];
        }
        while(j< right.length){
            sorted[k++] = right[j++];
        }

        return sorted;
    }
}
