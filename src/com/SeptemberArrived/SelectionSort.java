package com.SeptemberArrived;

import java.util.Arrays;

public class SelectionSort {
    private int[] sort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int last = n - i - 1;
            int maxi = 0;

            //find the maximum element index in the array
            for(int j = 0 ; j < n - i; j++){
                if(arr[j] > arr[maxi]){
                    maxi = j;
                }
                if(maxi != last){
                    int temp = arr[maxi];
                    arr[maxi] = arr[last];
                    arr[last] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {-3,-4,-20,0,50,30};

        SelectionSort ob = new SelectionSort();
        int[] sorted = ob.sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
