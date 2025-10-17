package com.weAreNowInOctober.hehe;
//You are given two positive integer arrays nums1 and nums2, both of length n.
//The absolute sum difference of arrays nums1 and nums2 is defined as the sum of |nums1[i] - nums2[i]|
//for each 0 <= i < n (0-indexed).
//You can replace at most one element of nums1 with any other element in nums1 to minimize the absolute sum difference.
//
//Return the minimum absolute sum difference after replacing at most one element in the array nums1.
//Since the answer may be large, return it modulo 109 + 7.
//|x| is defined as:
//x if x >= 0, or
//-x if x < 0.
//
//Example 1:
//Input: nums1 = [1,7,5], nums2 = [2,3,5]
//Output: 3
//Explanation: There are two possible optimal solutions:
//- Replace the second element with the first: [1,7,5] => [1,1,5], or
//- Replace the second element with the third: [1,7,5] => [1,5,5].
//Both will yield an absolute sum difference of |1-2| + (|1-3| or |5-3|) + |5-5| = 3.

//Example 2:
//Input: nums1 = [2,4,6,8,10], nums2 = [2,4,6,8,10]
//Output: 0
//Explanation: nums1 is equal to nums2 so no replacement is needed. This will result in an
//absolute sum difference of 0.
//
//Example 3:
//Input: nums1 = [1,10,4,4,2,7], nums2 = [9,3,5,1,7,4]
//Output: 20
//Explanation: Replace the first element with the second: [1,10,4,4,2,7] => [10,10,4,4,2,7].
//This yields an absolute sum difference of |10-9| + |10-3| + |4-5| + |4-1| + |2-7| + |7-4| = 20

import java.util.Arrays;

class MinAbsoluteSumDiff {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        if(n == 0){
            return 0;
        }
        int[] temp = nums1.clone();
        Arrays.sort(temp);

        long originalSum = 0 , minSum;
        for(int i = 0 ; i < n ; i++){
            originalSum += Math.abs(nums1[i] - nums2[i]);//finding the initial min absolute sum of difference of nums1[i] and
            //nums2[i] because it can be possible that it is the answer
        }

        //trying to find the index whose elements give the maximum difference thereby increasing the absolute sum
        int maxDiff = Integer.MIN_VALUE;//initialising the maxdiff with th most appropriate value for now
        int maxIndex = 0; //will contain the index at which we get the maximum difference
        for(int i = 0 ; i < n ; i++){
            int diff = Math.abs(nums1[i] - nums2[i]);
            if(diff > maxDiff){
                maxDiff = diff;
                maxIndex = i;
            }
        }

        //finding the closest element to the element in the index we get the maximum difference to replace.
        int closest = findClosest(temp,nums2[maxIndex]);

        //replacing the element with the closest element found
        nums1[maxIndex] = closest;

        //now calculating the new sum after the replacement
        int newSum = 0;
        for(int i = 0 ; i < n ; i++){
            newSum += Math.abs(nums1[i] - nums2[i]);
        }

        return (int)Math.min(originalSum,newSum);
    }

    private int findClosest(int[] nums, int target) {
        int left = 0 , right = nums.length - 1;
        int closest = nums[0];
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(Math.abs(nums[mid] - target) < Math.abs(closest - target)){
                closest = nums[mid];
            }
            if(nums[mid] == target){
                return nums[mid];
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,10,4,4,2,7};
        int[] nums2 = {9,3,5,1,7,4};
        MinAbsoluteSumDiff ob = new MinAbsoluteSumDiff();
        int result = ob.minAbsoluteSumDiff(nums1,nums2);
        System.out.println(result);
    }
}