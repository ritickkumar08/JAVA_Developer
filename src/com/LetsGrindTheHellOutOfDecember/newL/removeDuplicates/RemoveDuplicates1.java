package com.LetsGrindTheHellOutOfDecember.newL.removeDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;

public class RemoveDuplicates1 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3};
        RemoveDuplicates1 ob = new RemoveDuplicates1();
        ArrayList<Integer> k = ob.removeDuplicates(arr);
        System.out.println(k);
    }

    ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]); //because the first element will always be unique
        int n = arr.length;

//        int k = 1;
//
//        for (int i = 1; i < n; i++) {
//            if(arr[i] != arr[k-1]){
//                list.add(arr[k]);
//                k++;
//            }
//        }
//        return list;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
