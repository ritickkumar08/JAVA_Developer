package com.NovemberHeHe.recurrsionAgain;

public class FirstIndex {
    public static void main(String[] args) {
        int[] nums = {8,8,8,8,8,7,7,7,7,5,4,3,2,2,1,1,1,3};
        int k = 2;
        FirstIndex ob = new FirstIndex();
        System.out.println(ob.firstIndex(nums,k,0));
    }

    private int firstIndex(int[] nums, int k , int i) {
        if(i == nums.length){
            return -1;
        }
        if(nums[i] == k){
            return i;
        }else{
            int fisa = firstIndex(nums,k,i+1);
            return fisa;
        }
    }
}
