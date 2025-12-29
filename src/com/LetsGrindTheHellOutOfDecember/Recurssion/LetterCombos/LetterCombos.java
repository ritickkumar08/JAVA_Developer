package com.LetsGrindTheHellOutOfDecember.Recurssion.LetterCombos;

public class LetterCombos {
    public static void main(String[] args) {
        String digits = "23";
        LetterCombos ob = new LetterCombos();
        ob.pad("", digits);
    }
    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';// to convert char to number ot int
        for (int i = (digit - 1); i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }
}
