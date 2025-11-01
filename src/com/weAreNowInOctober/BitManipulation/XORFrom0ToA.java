package com.weAreNowInOctober.BitManipulation;

public class XORFrom0ToA {
    public static void main(String[] args) {
        int a = 6;

        if(a % 4 == 0) System.out.println(a);
        else if(a % 4 == 1) System.out.println(1);
        else if(a % 4 == 2) System.out.println(2);
        else System.out.println(3);
    }
}
