package com.NovemberHeHe.recurrsionAgain;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int target  = 4;
        SearchInRotatedArray ob = new SearchInRotatedArray();
        int result =  ob.searchInRotated(arr,target,0,arr.length - 1);
        System.out.println(result);
    }

    private int searchInRotated(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return searchInRotated(arr, target, start, mid-1);
            }else {
                return searchInRotated(arr, target, mid+1,end );
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return searchInRotated(arr, target, mid+1, end);
        }
        return searchInRotated(arr, target, start, mid-1);
    }
}
