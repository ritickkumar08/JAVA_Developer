package com.weAreNowInOctober.Strings;

public class printAlphabet {
    public static void main(String[] args) {
        String series = "a";
        for(int i = 1 ; i < 26 ; i++){
            char ch = (char)('a' + i);
            series += "," + ch;
        }
        System.out.print(series);
    }
}
