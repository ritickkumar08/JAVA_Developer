package com.LetsGrindTheHellOutOfDecember.Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        int[] nums = {1,2,3};
        Permutations ob = new Permutations();
        List<List<Integer>> answer = ob.permute(nums);
        ArrayList<String> answer1 = ob.permutations(str);
        System.out.println(answer1);
    }

    private ArrayList<String> permutations(String str) {
        if(str.length() == 0){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        char ch = str.charAt(0);
        String rest = str.substring(1);

        ArrayList<String> permutations = permutations(rest);
        ArrayList<String> myResult = new ArrayList<>();

        for(String perms : permutations){
            for (int i = 0; i <= perms.length(); i++) {
                String newStr = perms.substring(0,i) + ch + perms.substring(i,perms.length());
                myResult.add(newStr);
            }
        }
        return myResult;
    }

    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            List<List<Integer>> baseCase = new ArrayList<>();
            baseCase.add(new ArrayList<>());
            return baseCase;
        }

        int first = nums[0];
        int[] rest = Arrays.copyOfRange(nums,1,nums.length);

        List<List<Integer>> permutations = permute(rest);
        List<List<Integer>> myAnswer = new ArrayList<>();

        for(List<Integer> perms : permutations){
            for (int i = 0; i <= perms.size(); i++) {
                List<Integer> newList = new ArrayList<>(perms);
                newList.add(i,first);
                myAnswer.add(newList);
            }
        }
        return myAnswer;
    }
}
