package com.LetsGrindTheHellOutOfDecember.Recurssion.LetterCombos;

import java.util.ArrayList;
import java.util.List;

class LetterCombinations1 {
    public static void main(String[] args) {
        String number = "123";
        LetterCombinations1 ob = new LetterCombinations1();
        List<String> combinations = ob.letterCombinations(number);
        System.out.println(combinations);
    }
    private static final String[] MAP = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return result;
        }

        backTracking(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backTracking(String digits, int i, StringBuilder combinations, List<String> result) {
        if(i == digits.length()){
            result.add(combinations.toString());
            return;
        }

        int digit = digits.charAt(i) - '0';
        String letters = MAP[digit];

        for(char ch : letters.toCharArray()){
            combinations.append(ch);
            backTracking(digits, i+1, combinations, result);
            combinations.deleteCharAt(combinations.length() - 1);
        }
    }
}