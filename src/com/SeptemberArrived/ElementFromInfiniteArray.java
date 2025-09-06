package com.SeptemberArrived;

public class ElementFromInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 11, 13, 17, 19, 21, 25, 27, 30, 32, 35, 39, 41, 43, 47, 50,
                52, 55, 58, 60, 63, 65, 67, 70, 72, 74, 77, 80, 83, 85, 87, 90, 93,
                95, 97, 100, 104, 107, 110, 113, 115, 118, 120, 123, 126, 129, 132, 135};
        int target = 52;

        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr ,int target){
        //initial start and end points to search the element or the range of search
        //first check with box size 2
        int start = 0;
        int end = 1;

        //changeing the range of search
        while(target > arr[end]){
            int newStart = end + 1;//new start
            //defining the end of the new range
            //double the box value (end - (start - 1)) * 2
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int left, int right){
//        int left = start;
//        int right = end;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(target < arr[mid]){
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
