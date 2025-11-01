package com.weAreNowInOctober.BitManipulation;

//given a number return the number of set bits.

public class NumberOfSetBits {
    public static void main(String[] args) {
        NumberOfSetBits ob = new NumberOfSetBits();
        int n = 100;
        int count = 0;
        System.out.println(Integer.toBinaryString(n));

        while(n > 0){
            if((n & 1) == 1){
                count++;
            }n = n >> 1;
        }
        System.out.println(count);
        System.out.println(ob.setBits(7));
    }

    public int setBits(int n){
        int count = 0;

        while(n > 0){
            count++;
            n -= (n & (-n));
        }
        return count;
    }
    public int setBits1(int n){
        int count = 0;

        while(n > 0){
            count++;
            n -= (n & (n-1));
        }
        return count;
    }

}
