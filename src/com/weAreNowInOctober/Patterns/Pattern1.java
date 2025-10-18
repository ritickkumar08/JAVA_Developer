package com.weAreNowInOctober.Patterns;

import java.util.Scanner;

public class Pattern1 {
    private void pattern(int n) {
        for(int row = 0 ; row < n ; row++){
            for(int col = n - row ; col > 0 ; col--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern1 ob = new Pattern1();
        ob.pattern(n);
    }
}
