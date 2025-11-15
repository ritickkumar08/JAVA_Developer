package com.NovemberHeHe.recurrsionAgain;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        KeypadCombination ob = new KeypadCombination();
        ArrayList<String> list = ob.keypadCombination(str);
        System.out.println(list);
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    private ArrayList<String> keypadCombination(String str) {
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(" ");
            return baseResult;
        }

        char ch = str.charAt(0);
        String rest = str.substring(1);
        ArrayList<String> recursionList = keypadCombination(rest);

        ArrayList<String> myList = new ArrayList<>();
        String codesOfCh = codes[ch - '0'];
        for (int i = 0; i < codesOfCh.length(); i++) {
            char chCode = codesOfCh.charAt(i);
            for(String recursionItem : recursionList){
                myList.add(chCode + recursionItem);
            }
        }
        return myList;
    }
}
