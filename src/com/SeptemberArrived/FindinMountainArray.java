package com.SeptemberArrived;

import java.util.Scanner;

public class FindinMountainArray {
    private int findPeak(int[] arr){
        int start  = 0;
        int end = arr.length;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    private int binarySearch(int[] arr,int target, int start, int end , boolean asc){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) return mid;

           if(asc){
               if(target < arr[mid]) end = mid - 1;
               else start = mid + 1;
           }
           else{
               if(target  < arr[mid]) end = mid + 1;
               else start = mid - 1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target to be found" + " ");
        int target = sc.nextInt();
        System.out.println("the length of the array" + " ");
        int length = sc.nextInt();
        System.out.println("enter the elements of the array" + " ");
        int[] arr = new int[length];
        for(int i = 0 ; i < length ; i++){
            arr[i] = sc.nextInt();
        }

        FindinMountainArray ob = new FindinMountainArray();
        int peak = ob.findPeak(arr);
        System.out.println(peak);

        int index = ob.binarySearch(arr,target,0,peak,true);
        if(index != -1) System.out.println(index);
        else{
            System.out.println(ob.binarySearch(arr,target,peak + 1, length - 1 ,false));
        }
    }
}
