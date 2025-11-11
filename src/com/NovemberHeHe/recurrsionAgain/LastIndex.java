package com.NovemberHeHe.recurrsionAgain;

public class LastIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,8,30,40,8,30,9,2,1,8,30,1,20};
        int k = 30;
        LastIndex ob = new LastIndex();
        System.out.println(ob.lastIndex(nums,k,0));
    }

    private int lastIndex(int[] nums, int k, int i) {
        if(i == nums.length){
            return -1;
        }

        if(nums[nums.length - i -1] == k){
            return i-1;
        }else{
            int lisa = lastIndex(nums,k,i+1);
            return lisa;
        }
    }
}
