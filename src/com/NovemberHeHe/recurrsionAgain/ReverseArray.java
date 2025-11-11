package com.NovemberHeHe.recurrsionAgain;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,55,666,77};
        int n = 7;
        ReverseArray ob = new ReverseArray();
        ob.reverseArray(nums,0);
    }

    private void reverseArray(int[] nums, int i) {
        if(i == nums.length){
            return;
        }
        reverseArray(nums, i + 1 );
        System.out.println(nums[i]);
    }
}
