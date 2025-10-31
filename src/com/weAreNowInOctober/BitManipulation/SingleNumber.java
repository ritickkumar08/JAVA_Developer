package com.weAreNowInOctober.BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        SingleNumber ob = new SingleNumber();
        System.out.println(ob.singleNumber(arr));
    }

    private int singleNumber(int[] arr) {
        int unique = 0;
        for(int i = 0 ; i < arr.length ; i++){
             unique ^= arr[i];
        }
        return unique;
    }
}
