package com.NovemberHeHe.math;

public class IsPrime {
    public boolean isPrime(int n){
        if (n <= 1) return false;

        for(int i = 2; i*i <= n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 40;
        IsPrime ob = new IsPrime();
        for(int i = 1 ; i <= n ; i++) {
            if(ob.isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
