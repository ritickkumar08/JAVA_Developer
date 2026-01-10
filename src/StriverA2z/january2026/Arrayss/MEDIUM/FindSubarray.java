package StriverA2z.january2026.Arrayss.MEDIUM;
//Given an array of integers arr[], find the contiguous subarray with the maximum sum that contains only non-negative
//numbers. If multiple subarrays have the same sum, return the one with the smallest starting index.
//If the array contains only negative numbers, return -1.
//
//Note: A subarray is a contiguous non-empty sequence of elements within an array.

import java.util.ArrayList;

class FindSubarray {
    public static void main(String[] args) {
        int[] nums = {206, 20, 789, 184, 853, 948, 822, 0};
        FindSubarray ob = new FindSubarray();
        ArrayList<Integer> answwer = ob.findSubarray(nums);
        System.out.println(answwer);
    }
    public ArrayList<Integer> findSubarray(int nums[]) {
        // code here

        int currentSum = 0;
        int bestSum = -1;

        int currentStart = 0;
        int bestStart = -1;
        int bestEnd = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0 ){
                currentSum = 0;
                currentStart = i+1;
            }else {
                currentSum += nums[i];

                if (currentSum > bestSum || (currentSum == bestSum && currentStart < bestStart)) {
                    bestSum = currentSum;
                    bestStart = currentStart;
                    bestEnd = i;
                }else if (currentSum == bestSum && currentStart == bestStart) {
                    // extend the subarray
                    bestEnd = i;
                }
            }
        }

        if(bestSum == -1){
            ArrayList<Integer> answer = new ArrayList<>();
            answer.add(-1);
            return answer;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = bestStart; i <= bestEnd; i++) {
            list.add(nums[i]);
        }
        return list;
    }
}