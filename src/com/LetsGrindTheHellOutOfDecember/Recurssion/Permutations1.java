package com.LetsGrindTheHellOutOfDecember.Recurssion;

import java.util.ArrayList;

public class Permutations1 {
    public static void main(String[] args) {
        Permutations1 ob = new Permutations1();
//        ob.Permutations("" , "abc");
//        ArrayList<String> answer = ob.Permutations1("","abc");
//        System.out.println(answer);
        int count = ob.PermutationsCount("","abc");
        System.out.println(count);
    }
    public void Permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            Permutations(f + ch + s, up.substring(1));
        }
    }
    public ArrayList<String> Permutations1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add(p);
            return baseCase;
        }

        char ch = up.charAt(0);

        ArrayList<String> myAnswer = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            myAnswer.addAll(Permutations1(f + ch + s, up.substring(1)));
        }

        return myAnswer;
    }

    public int PermutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count += PermutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }

}
