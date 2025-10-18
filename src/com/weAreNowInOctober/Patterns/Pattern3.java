package com.weAreNowInOctober.Patterns;

import java.util.Scanner;

public class Pattern3 {
    private void pattern(int n) {
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int row = n+1 ; row < 2*n ; row++){
            for(int col = 2*n - row ; col > 0 ; col--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern3 ob = new Pattern3();
        ob.pattern(n);
    }
}
