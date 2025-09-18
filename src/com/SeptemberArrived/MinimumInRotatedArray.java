package com.SeptemberArrived;

public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[end]) start = mid + 1;
            else if(nums[mid] < nums[end]) end = mid;
            else end--;
        }
        return nums[start];
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,1,2,3,3,4,5};
        MinimumInRotatedArray ob = new MinimumInRotatedArray();
        System.out.println(ob.findMin(arr));
    }
}
