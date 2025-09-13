package com.SeptemberArrived;

public class FindInRotatedArray {
    private int findPivot(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            //case 1 :- if when we find the highest value as mid, so as to check it with the
            //next value because, as the array is rotated we wont have a greater value next to
            // pivot element.
            if(mid < right && nums[mid] > nums[mid + 1]){
                return mid;
            }
            //case 2 :- if we happen to find the smallest element of the array as mid, we will
            //for the element just before it if the element is greater to the mid element.
            if(mid > left && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            // now for updating the start and end for better time complexity and avoid time limit
            //exceed
            if(nums[mid] >= nums[left]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearch(int[]nums,int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {

        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int pivot = findPivot(nums);
        //case 1 : pivote element is not found i.e. the array is not rotated
        if(pivot == -1){
            return binarySearch(nums,target,start,end);
        }

        //case 2 : when the pivot element is the target
        if(nums[pivot] == target){
            return pivot;
        }

        //case 3: when the target lise in first half of the array from index 0 to index of pivot
        //element
        if(target >= nums[start]){
            return binarySearch(nums,target,start,pivot);
        }

        //case 4: when the target lies is second sorted array that is after pivot element
        else{
            return binarySearch(nums,target,pivot + 1, end);
        }

    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        FindInRotatedArray ob = new FindInRotatedArray();
        int index = ob.search(arr, target);
        System.out.println(index);
    }
}
