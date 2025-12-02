package com.LetsGrindTheHellOutOfDecember.Recurssion;

public class RemoveA {
    public static void main(String[] args) {
        String str = "baaccdab";
        RemoveA ob = new RemoveA();
        String result = ob.removeCharacter(str);
        System.out.println(result);
    }

    private String removeCharacter(String str) {
        if(str.length() == 0){
            return "";
        }
//        StringBuilder result = new StringBuilder();
        char ch = str.charAt(0);
        String remain = str.substring(1);
        if(ch != 'a'){
           return ch + removeCharacter(remain);
        }
        return  "" + removeCharacter(remain);
    }
}
