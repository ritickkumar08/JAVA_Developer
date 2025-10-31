package com.weAreNowInOctober.BitManipulation;

public class PowerOFTwo {
    public static void main(String[] args) {
        int n = 4;
        int count = 0;

        while(n > 0){
            int binaryDigit = n & 1;
            if(binaryDigit == 1){
                count++;
                if(count == 2){
                    break;
                }
            }n = n >> 1;
        }
        if(count == 1){
            System.out.println("yes it is power of 2");
        }else {
            System.out.println("not a power of 2");
        }

        PowerOFTwo ob = new PowerOFTwo();
        System.out.println(ob.powerOfTwo(n));
    }

    //as we know that the 1000(n) + 0111(n-1) == 0
    public boolean powerOfTwo(int n){
        return ((n & (n-1)) == 0);
    }
}
