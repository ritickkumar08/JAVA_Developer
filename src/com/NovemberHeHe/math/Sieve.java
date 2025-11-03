package com.NovemberHeHe.math;

public class Sieve {
    public void sieve(int n, boolean[] primes){
        int count = 0;
        for (int i = 2; i*i <= n; i++) {
            if(!primes[i]){
                for (int j = i*2 ; j <=n ; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println(count + " " + "prime numbers in the range");
    }
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        Sieve ob = new Sieve();
        ob.sieve(n,primes);
    }
}
