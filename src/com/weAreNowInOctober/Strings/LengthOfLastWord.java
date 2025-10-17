package com.weAreNowInOctober.Strings;
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal substring consisting of non-space characters only.
//Example 1:
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] array = s.split(" ");
        int n = array.length;

        return array[n-1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        LengthOfLastWord ob = new LengthOfLastWord();
        int length = ob.lengthOfLastWord(s);
        System.out.println(length);
    }
}