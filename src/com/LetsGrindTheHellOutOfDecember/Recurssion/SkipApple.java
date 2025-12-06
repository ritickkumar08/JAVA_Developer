package com.LetsGrindTheHellOutOfDecember.Recurssion;

public class SkipApple {
    public static void main(String[] args) {
        String str = "appleball";
        SkipApple ob = new SkipApple();
        String processedStr = ob.skipApple(str);
        System.out.println(processedStr);
    }

    private String skipApple(String str) {
        if(str.length() == 0){
            return "";
        }

        char ch = str.charAt(0);
        String rest = str.substring(1);
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else {
            return ch + skipApple(rest);
        }

    }
}
