package com.NovemberHeHe.recurrsionAgain;

public class MaximumElement {
    public static void main(String[] args) {
        int[] nums = {10,20,33,44,55,45,6};
        MaximumElement ob = new MaximumElement();
        System.out.println(ob.maximumElement(nums,0));
    }

    private int maximumElement(int[] nums, int i) {
        if(i == nums.length){
            return 1;
        }

        return Math.max(nums[i], maximumElement(nums,i+1));
    }
}
