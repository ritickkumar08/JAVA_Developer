package com.NovemberHeHe.recurrsionAgain.Sorts;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,2,3,4,5,66,5,43,2,3,45,43,2,34,5,43,2,45,43,4,5,43,45,4,3};
        MergeSortInPlace ob = new MergeSortInPlace();
        ob.mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1){
            return;
        }

        int mid = (start + end) / 2;

        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private void mergeInPlace(int[] arr,int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < mid){
            mix[k++] = arr[i++];
        }
        while (j < end){
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
