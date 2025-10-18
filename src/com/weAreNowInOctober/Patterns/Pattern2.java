package com.weAreNowInOctober.Patterns;

import java.util.Scanner;

public class Pattern2 {
    private void pattern(int n) {
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern2 ob = new Pattern2();
        ob.pattern(n);
    }
}
