package com.weAreNowInOctober.recurssion;

import java.util.Scanner;

public class Fibonacci {
    public int fibo(int n ){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci ob = new Fibonacci();
        System.out.println(ob.fibo(4));
        int n = sc.nextInt();
        for(int i = 0 ; i <= n ; i++){
            System.out.print(ob.fibo(i) + ", ");
        }
    }
}
