package com.SeptemberArrived;

public class MedianOfTwoSortedArray {
    private int[] merge(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n || j < m){
            if(i == n){
                while(j < m) arr[k++] = nums2[j++];
                break;
            }
            if(j == m){
                while(i < n) arr[k++] = nums1[i++];
                break;
            }

            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }
        }
        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1, nums2);
        int len = arr.length;
        double median;
        if(len % 2 == 0){
            int first = len / 2 - 1;
            int second =  ((len / 2) + 1) - 1;
            median = (arr[first] + arr[second] ) / 2.0;
        }
        else{
            median = arr[len/2 + 1];
        }

        return median;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        MedianOfTwoSortedArray ob = new MedianOfTwoSortedArray();
        double median = ob.findMedianSortedArrays(arr1,arr2);
        System.out.println(median);
    }
}
