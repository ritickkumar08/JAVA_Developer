package com.weAreNowInOctober.recurssion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,55,66,77,78,79,80,87,89};
        int target = 5;
        BinarySearch ob = new BinarySearch();
        System.out.println(ob.binarySearch(arr, target, 0, arr.length - 1));
    }

    public int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return binarySearch(arr, target, start, mid-1);
        }
        return binarySearch(arr, target, mid + 1, end);
    }
}
