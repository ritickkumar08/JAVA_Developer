package com.weAreNowInOctober.BitManipulation;

public class OddEven {
    public static void main(String[] args) {
        OddEven ob = new OddEven();
        int n = 67;
       ob.isOdd(n);
    }

    private void isOdd(int n) {
//        return (n & 1) == 1;
        if((n&1) == 1){ //as we know that internally the computer works on binary and if when the number is bitwise AND
            //with 1, and it returns 1 then the last bit is 1 so the number is odd.
            System.out.println("number is odd");
        } else{//if the last digit too is 0 then the bitwise AND will not give 1 and so the number is even
            System.out.println("number is even");
        }
    }
}
