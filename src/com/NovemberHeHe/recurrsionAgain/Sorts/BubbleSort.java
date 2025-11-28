package com.NovemberHeHe.recurrsionAgain.Sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,5,6,7,9,8};
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(arr,0,1);
        System.out.println(Arrays.toString(arr));;
    }

    private void bubbleSort(int[] arr, int i, int j) {
        if(i == arr.length - 1){
            return;
        }


       if(j == arr.length - i){
           bubbleSort(arr, i + 1, 1);
           return;
       }

        if (arr[j] < arr[j - 1]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }

        bubbleSort(arr, i, j+1);


    }
}
