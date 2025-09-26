//287. Find the Duplicate Number
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and using only constant extra space.
//
//Example 1:
//
//Input: nums = [1,3,4,2,2]
//Output: 2


package com.August;

class FindTheDuplicateElement {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length;

        while(i < n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        return nums[n-1];  //as we know that after cyclic sort the duplicate element will reside at the end of the
        //sorted array because we have all the rest of the elements which coincide to their index values
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};

        FindTheDuplicateElement ob = new FindTheDuplicateElement();
        int duplicate = ob.findDuplicate(arr);
        System.out.println(duplicate);
    }
}