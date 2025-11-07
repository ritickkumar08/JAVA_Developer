package com.NovemberHeHe.math;

public class GCD_LCM {
    public static void main(String[] args) {

        int a = 5;
        int b = 200;
        GCD_LCM ob = new GCD_LCM();
        System.out.println(ob.gcd(a,b));
        System.out.println(ob.lcm(a,b));
    }
    public int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return  gcd(b%a, a);
    }
    public int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

}
