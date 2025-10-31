package com.weAreNowInOctober.BitManipulation;

//write a progam to find the nth magic number.
//the magic number is defined as,
// 5^3  5^2  5^1
//1st -> 001 -> now 5^3 * 0 + 5^2 * 0 + 5^1 * 1 = 5
//2nd -> 010 ->  5^3 * 0 + 5^2 * 1 + 5^1 * 0 = 25
//3rd -> 011 ->  5^3 * 0 + 5^2 * 1 + 5^1 * 1 = 30
//4nd -> 100 ->  5^3 * 1 + 5^2 * 0 + 5^1 * 0 = 125


public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        MagicNumber ob = new MagicNumber();
        System.out.println(ob.magicNumber2(n));
    }

    private int magicNumber(int n) {
        int result = 0;
        int index = 1;
        while(n > 0){
            int binaryDigit = n & 1;
            result += Math.pow(5,index) * binaryDigit;
            n = n >> 1;
            index++;
        }
        return result;
    }

    public int magicNumber2(int n){
        int base = 5;
        int result = 0;
        while(n > 0){
            int lastBinaryDigit = n & 1;
            n = n >> 1;
            result += base * lastBinaryDigit;
            base = base * 5 ;
        }
        return result;
    }
}
