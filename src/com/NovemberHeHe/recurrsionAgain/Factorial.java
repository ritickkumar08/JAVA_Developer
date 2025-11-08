package com.NovemberHeHe.recurrsionAgain;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        Factorial ob = new Factorial();
        System.out.println(ob.factorial(n));
    }

    private int factorial(int n) {
        if(n == 1){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
}
