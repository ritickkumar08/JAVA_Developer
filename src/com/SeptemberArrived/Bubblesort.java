package com.SeptemberArrived;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    private int[] sort(int[] arr){
        int n = arr.length;
        boolean swapped;
        //as we know that the loop is going to check for only n - 1 steps and after that the array will be sorted
        for(int i = 0 ; i < n - 1 ; i++){
            swapped = false; //if there is no swaps for any value then that implies ,array to be sorted and so we dont
            //need any further comparisons
            for(int j = 1 ; j < n - i - 1 ; j++){ //this loop is actually comparing the values inside the given array
                if(arr[j-1] > arr[j]){ //to check if the values are greater than the previous value
                    int temp = arr[j-1]; //applying the swap logic
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true; //if the element is swapped to any level then the swapped will be true and the
                    //loop will continue its execution
                }
            }
            if(!swapped){//if the array is already sorted and there is no swapping then the loop will stop executing.
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        int[] arr = {-5, 1, 4, 2, -8, 0};

        Bubblesort ob = new Bubblesort();
        int[] sorted = ob.sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
