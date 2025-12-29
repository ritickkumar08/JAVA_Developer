package com.LetsGrindTheHellOutOfDecember.Recurssion.LetterCombos;

import java.util.ArrayList;
import java.util.List;

class LetterCombinations {
    public static void main(String[] args) {
        String number = "123";
        LetterCombinations ob = new LetterCombinations();
        List<String> combinations = ob.letterCombinations(number);
        System.out.println(combinations);
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        String[] map = {
                "", "", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz"
        };

        char ch = digits.charAt(0);
        String rest = digits.substring(1);

        List<String> myAnswer = new ArrayList<>();
        List<String> rList = letterCombinations(rest);
        String codeOfch = map[ch - '0'];

        for (int i = 0; i < codeOfch.length() ; i++) {
            char currentNumber = codeOfch.charAt(i);
            for(String s : rList){
                myAnswer.add(currentNumber + s);
            }
        }
        return myAnswer;
    }
}