package com.August;

import java.util.Arrays;

public class InsertionSort {
    private int[] sort(int[] arr){
        int n = arr.length;
        for(int i  = 0 ; i < n - 1 ;i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        int[] sorted = ob.sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
