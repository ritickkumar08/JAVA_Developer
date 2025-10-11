package com.weAreNowInOctober.sortByParity;
//Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
//Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
//Return any answer array that satisfies this condition.
//Example 1:
//Input: nums = [4,2,5,7]
//Output: [4,5,2,7]
//Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.


import java.util.Arrays;

class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;

        while(even < n && odd < n){
            if(isEven(nums[even])) even+=2; //if the element at the even index is even then just update to the next
            //even index.
            else if(!isEven(nums[odd])) odd+=2;//if  the element at the odd index which starts from 1 is odd then just
            //update the index odd to point at next odd index
            else{
                swap(nums,even,odd);//if the above two conditions fail that implies the element is not at its desired
                //index so a swap is needed at the index at which our odd and even pointers are standing.
            }
        }
        return nums;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    private boolean isEven(int num) {
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        SortArrayByParityII ob = new SortArrayByParityII();
        int[] result = ob.sortArrayByParityII(arr);
        System.out.println(Arrays.toString(result));
    }
}