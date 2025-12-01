package com.NovemberHeHe.recurrsionAgain.Sorts;

import java.util.Arrays;

public class MergerSortInplaceRev {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,5,3,2,34,5,7,78,6,89,0,9,0,98,76,78,90,98,765,678,7,54,3,56,7,654,3};
        MergerSortInplaceRev ob = new MergerSortInplaceRev();
        ob.mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private void mergeSort(int[] arr,int start, int end){
        if(end - start == 1){
            return;
        }

        int mid = (end + start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
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

        while(i < mid){
            mix[k++] = arr[i++];
        }

        while(j < end){
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length ; l++) {
            arr[start + l] = mix[l++];
        }
    }
}
