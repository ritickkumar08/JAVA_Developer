package com.weAreNowInOctober.BitManipulation;

public class XORFromAtoB {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        XORFromAtoB ob = new XORFromAtoB();

        System.out.println(ob.findXOR(b) ^ ob.findXOR(a - 1));

        int ans2 = 0;
        for(int i = a ; i <= b ; i++){
            ans2 ^= i;
        }
        System.out.println(ans2 );
    }
    public int findXOR(int a){

        if(a % 4 == 0) return a;
        if(a % 4 == 1)  return  1;
        if(a % 4 == 2) return a + 1 ;
        return 0;
    }
}
