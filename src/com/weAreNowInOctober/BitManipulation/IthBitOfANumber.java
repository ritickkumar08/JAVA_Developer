package com.weAreNowInOctober.BitManipulation;

public class IthBitOfANumber {
    public static void main(String[] args) {
        int n = 16;
        int i = 5;
        IthBitOfANumber ob = new IthBitOfANumber();
        ob.ithBit(n,i);
    }

    private void ithBit(int n,int i) {
        System.out.println(n & (1 << (i-1)));
    }
}
