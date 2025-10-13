package com.weAreNowInOctober;
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be
//unique, and you may return the result in any order.
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    if(!list.contains(nums1[i])){
                        list.add(nums1[i]);
                    }
                   break;
                }
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Intersection ob = new Intersection();
        int[] result = ob.intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}