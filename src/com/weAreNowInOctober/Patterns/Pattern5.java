package com.weAreNowInOctober.Patterns;

import java.util.Scanner;

public class Pattern5 {
    private void pattern(int n) {
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= n-row ; col++){
                System.out.print(" ");
            }
            for(int col = 1 ; col <= (2*row)-1 ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern5 ob = new Pattern5();
        ob.pattern(n);
    }
}
