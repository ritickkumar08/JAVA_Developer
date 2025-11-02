package com.NovemberHeHe;

//Reverse bits of a given 32 bits signed integer.
//Example 1:
//Input: n = 43261596
//Output: 964176192
//Explanation:
//Integer	Binary
//43261596	00000010100101000001111010011100
//964176192	00111001011110000010100101000000

class ReverseBits {
    public int reverseBits(int n) {
        int reverse = 0;
       for(int i = 0; i < 32 ; i++){
            reverse = (reverse << 1) | (n & 1); //adds the last bit of n
            n = n >> 1; // removes the last bit
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = 43261596;
        ReverseBits ob = new ReverseBits();
        int resut = ob.reverseBits(n);
        System.out.println(resut);
    }
}