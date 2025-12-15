package com.LetsGrindTheHellOutOfDecember.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Subsets {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4};
        Subsets ob = new Subsets();
        List<List<Integer>> list = ob.subsets(nums);
        System.out.println(list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length == 0){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            return list;
        }

        int element = nums[0];
        int[] rest = Arrays.copyOfRange(nums,1,nums.length);
        // recursion on smaller array
        List<List<Integer>> recurssionResult = subsets(rest);

        //now forming the actual result variable
        List<List<Integer>> myResult = subsets(rest);

        //no adding the previous elements.
        for(List<Integer> list  : recurssionResult){
            List<Integer> newList = new ArrayList<>(list);
            newList.add(0,element);

            myResult.add(newList);
        }

        return myResult;
    }
}