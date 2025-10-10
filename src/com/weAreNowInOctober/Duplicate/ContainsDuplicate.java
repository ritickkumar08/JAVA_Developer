package com.weAreNowInOctober.Duplicate;
//here we are doing cyclic sort and if there is any duplicate it will be in the wrong position, so we check if any element
//is in wrong position then we return true and if not we return false.
//this doesn't work for every condition because it doesn't follow the rule of being from 1 - n.

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j + 1){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        ContainsDuplicate ob = new ContainsDuplicate();
        boolean result = ob.containsDuplicate(arr);
        System.out.println(result);
    }
}
