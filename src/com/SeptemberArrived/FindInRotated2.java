package com.SeptemberArrived;

public class FindInRotated2 {
    private int findPivot(int[] nums){
        int start = 0 ;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            //when we directly land on a mid which is the highest element of the array that is the pivot element
            //we check if the next element is less than the mid and if true we return the mid as to be the pivot elemsnt
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            //when we land to the smallest element of the array so we check if the previous element in the array is
            // greater or not if it is greater we return mid -1 to be the pivot element
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            //as we know that the array can contain duplicate values so if the next element of the array is equal to the
            //mid-element we keep on changing the start point, to find the last of the biggest element which are
            //equal
            // Case 3: duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // shrink both sides to skip duplicates
                if (start < end && nums[start] > nums[start + 1]) return start;
                start++;
                if (end > start && nums[end - 1] > nums[end]) return end - 1;
                end--;
            }
            //now to update the start and end indices accordingly
            // if the mid-element is greater than the start element of the array that means a number greater exists on
            // the right side of the mid-element so to check that we change the start element to be mid + 1.
            else if(nums[mid] >= nums[start]){
                start = mid + 1;
            }
            //if the upper condition fails that implies the bigger element is on the left side of the mid element so
            //we update the end index to be mid - 1
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    private boolean binarySearch(int[] nums, int target, int start , int end){
        // here we create a loop which executes till the start index becomes equal to the end index so that no element
        // is left unchecked
        while(start <= end){
            int mid = start + (end - start) / 2;

            //we find the mid-index and compare it to the target if they match we return the value directly
            if(nums[mid] == target) return true;
            //if the target is greater than the value in mid-index we update start index to be mid + 1 so as to only
            //where the element can possibly be found and to discard the rest of the array
            else if(target > nums[mid]) start = mid + 1;
            //if the upper condition fails that implies the target value is in the start side or part of the array
            // so we check towards the smaller elements.
            else end = mid - 1;
        }
        // if the target doesn't exist in the array given.
        return false;
    }
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1) return nums[0] == target;   // single-element case
        int start = 0;
        int end = n - 1;
        int pivot = findPivot(nums);


        //if the pivot element is not found the implies the array is not rotated and so the function of binarysearch will
        //be executed for the whole array
        if(pivot == -1){
            return binarySearch(nums,target,start, end);
        }
        //if it happens that the pivot element is the target element so we directly return true
        if(nums[pivot] == target ){
            return true;
        }
        //if the target is greater that or equal to the first appearance of the elemnet will be on the first half
        // of the rotated array
        if(target >= nums[start]){
            return binarySearch(nums,target,start,pivot);
        }
        // if the upper conditions fail then the target will be on the second half of the rotated array
        else{
            return binarySearch(nums,target,pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        int target = 0;

        FindInRotated2 ob = new FindInRotated2();
        int pivot = ob.findPivot(arr);
        System.out.println(pivot);

        boolean ifExist = ob.search(arr,target);
        System.out.println(ifExist);
    }
}
