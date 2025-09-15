package com.SeptemberArrived;

public class FindCount {
    private int count(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            //we know that the index where the smallest element is found will be the number of rotations a sorted array has done.
            //because the rotations make the last elements to come towards the starting position and shift the elements
            //by the number of rotations made.

            //we will try to find the smallest element by comparing it with the previous element in the array for the smaller
            //condition and wherever the smallest elemnet is found we will return it.
            if(mid > start && arr[mid] < arr[mid - 1]) return mid;

            //the smallest element will be existing just after the biggest element so we encounter the biggest element
            //we will increase it by 1 and return it.
            if(mid < end && arr[mid] > arr[mid + 1]) return mid + 1;

            //if we happen to any other elements in the array we will compare it to the starting element and if the mid element
            //is smaller than the start element we will update the end to be mid -1
            else if (arr[mid] < arr[start]) {
                end = mid - 1;
            }
            //if all the above conditions fail then we will update the start to be mid + 1.
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};

        FindCount ob = new FindCount();
        int numberOfRotations = ob.count(arr);
        System.out.println(numberOfRotations);
    }
}
