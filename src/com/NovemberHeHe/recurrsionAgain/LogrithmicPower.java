package com.NovemberHeHe.recurrsionAgain;

public class LogrithmicPower {
    public static void main(String[] args) {
        LogrithmicPower ob = new LogrithmicPower();
        int n = 5;
        int x = 4;
        System.out.println(ob.power(x,n));
    }

    private int power(int x, int n) {
        if(n == 0){
            return 1;
        }
        int powerOfNby2 = power(x, n/2);
        int powerN = powerOfNby2 * powerOfNby2;

        if (n % 2 == 1){
            powerN *= x;
        }

        return powerN;
    }
}
