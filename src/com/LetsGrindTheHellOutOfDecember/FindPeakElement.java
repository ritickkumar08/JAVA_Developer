package com.LetsGrindTheHellOutOfDecember;

//Given an integer array a[] of size n, find the highest element of the array.
//The array will either be strictly increasing or strictly increasing and then strictly decreasing.
//Note: a[i] != a[i+1]
//Example 1:
//
//Input: 11
//1 2 3 4 5 6 5 4 3 2 1
//Output:6
//Explanation: Highest element of array a[] is 6.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class FindPeakElement {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1));
        FindPeakElement ob = new FindPeakElement();
        int peak = ob.findPeakElement(nums);
        System.out.println(peak);
    }
    public int findPeakElement1(List<Integer> a) {
        // Code here
        int start = 0;
        int end = a.size()-1;

        if(a.get(start) < a.get(end)){
            return a.get(end);
        }
        while(start < end){
            int mid = (start + (end - start)) / 2;

            if(a.get(mid) > a.get(mid+1) && a.get(mid) > a.get(mid-1)) return a.get(mid);

            else if (a.get(mid) < a.get(mid+1)) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }
    public int findPeakElement(List<Integer> a) {
        // Code here
        int start = 0;
        int end = a.size()-1;

//        if(a.get(start) < a.get(end)){
//            return a.get(end);
//        }
        while(start < end){
            int mid = start + (end - start) / 2;

            if (a.get(mid) < a.get(mid+1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return a.get(start);
    }
}