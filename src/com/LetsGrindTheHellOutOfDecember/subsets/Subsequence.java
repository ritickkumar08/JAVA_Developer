package com.LetsGrindTheHellOutOfDecember.subsets;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        Subsequence ob = new Subsequence();
        ArrayList<String> list = ob.subSets(str);
        System.out.println(list);
    }

    private ArrayList<String> subSets(String str) {
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        String rest = str.substring(1);
        ArrayList<String> recurssionResult = subSets(rest);

        ArrayList<String> myResult = new ArrayList<>();
        for(String resultStr : recurssionResult){
            myResult.add(resultStr);
            myResult.add(ch + resultStr);
        }

        return  myResult;
    }
}
