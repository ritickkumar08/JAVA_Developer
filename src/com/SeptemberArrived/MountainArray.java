package com.SeptemberArrived;

import java.util.Scanner;

public class MountainArray {
    private int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1]){
                //it means you are in ascending side of the array
                //the mid can be the answer but a greater number can be present on the right hand side
                start = mid + 1;
            }
            else{
                //if the above condition is false that means it is possible the element on the left side can be a bigger one
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i < length ; i++){
            arr[i] = sc.nextInt();
        }

        MountainArray ob = new MountainArray();
        int peak = ob.peakIndex(arr);
        System.out.println(peak);
    }
}
