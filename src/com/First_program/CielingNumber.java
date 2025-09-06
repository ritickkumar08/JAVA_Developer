package com.First_program;

public class CielingNumber {
    private int binarySearch(int[] nums,int target){
        int left = 0 ;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/ 2;

            if(nums[mid] == target) {
               return mid;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] n = {1, 2, 5, 6, 8, 10, 14, 16, 18, 20, 24, 25, 28, 30, 32, 34, 36, 39};
        int target = 50;

        CielingNumber ob = new CielingNumber();
        int result = ob.binarySearch(n, target);
        System.out.println(result);
    }
}
