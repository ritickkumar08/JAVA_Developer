package com.weAreNowInOctober.ThreeSome;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
// and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//
//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();//declaring a list of list which will contain the array/list of
        //elements that sum up to 0.
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0 ; i < n - 2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){//we don't want to check for the same values of first index again and again
                //so if the element is same we will skip that element and move to next.
                continue;
            }
            int j = i + 1;//j pointer will be pointing to the element next to the i element
            int k = n - 1;//k pointer will be pointing to the last element of the array.

            while(j < k){

                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));//we will keep adding the list of elements which sum
                    //up to 0
                    j++;
                    while(nums[j] == nums[j-1] && j<k){//we will keep moving to the next element till we encounter
                        //a new element or a different value
                        j++;
                    }
                } else if (sum < 0) {//if the sum is smaller than 0, and as the array is sorted so a greater sum will
                    //be achieved if we move our j pointer to a greater value which lies to the right side
                    j++;
                }else {//if the sum is greater than 0, and as the array is sorted so a smaller value of sum can be achieved
                    //by moving our k pointer towards a smaller value which lies to the left.
                    k--;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> list = ob.threeSum(arr);
        System.out.println(list);
    }
}