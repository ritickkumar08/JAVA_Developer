package com.NovemberHeHe.recurrsionAgain;

import java.util.ArrayList;

public class GetSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        GetSubsequence ob = new GetSubsequence();
        ArrayList<String> result = ob.getSubsequence(str);
        System.out.println(result);
    }

    private ArrayList<String> getSubsequence(String str) {
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("-");
            return baseResult;
        }

        char ch = str.charAt(0);
        String restString = str.substring(1);
        ArrayList<String> resultRecurssion = getSubsequence(restString);

        ArrayList<String> myResult = new ArrayList<>();
        for(String resultStr : resultRecurssion){
            myResult.add("-" + resultStr);
            myResult.add(ch + resultStr);
        }
        return myResult;
    }
}
