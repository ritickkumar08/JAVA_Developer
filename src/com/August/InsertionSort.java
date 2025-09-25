package com.August;

import java.util.Arrays;

public class InsertionSort {
    //here we are using two for loops and a stopping criteria that if the element is smaller than that of the previous element
    //then we keep swapping and the moment it becomes greater we break out of the loop.
    private int[] sort(int[] arr){
        int n = arr.length;
        for(int i  = 0 ; i < n - 1 ;i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){ //here we check that if the element is smaller than that of the previous element.
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else { //if the above condition fails then just break out of the loop
                    break;
                }
            }
        }
        return arr;
    }
    //in this function we are doing the same thing with the help of while loop
    private int[] sortWhile(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
//           int key = arr[i];
           int j = i+1;

           while(arr[j] < arr[j-1]){
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
           }
        }
        return arr;
    }
    private int[] sortWhile2(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
           int key = arr[i];
            int j = i - 1;

            while(j >= 0 &&  arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        int[] sorted = ob.sort(arr);
        System.out.println(Arrays.toString(sorted));

        int[] sorted2 = ob.sortWhile(arr);
        System.out.println(Arrays.toString(sorted2));

        int[] sorted3 = ob.sortWhile2(arr);
        System.out.println(Arrays.toString(sorted3));
    }
}
