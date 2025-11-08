package com.NovemberHeHe.recurrsionAgain;

public class Power {
    public static void main(String[] args) {
        Power ob = new Power();
        int n = 5;
        int x = 4;
        System.out.println(ob.power(n,x));
    }

    private int power(int n, int x) {
        if(x == 0){
            return 1;
        }
        return n * power(n,x-1);
    }
}
