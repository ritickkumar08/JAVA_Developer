package com.weAreNowInOctober.Patterns;

import java.util.Scanner;

public class Pattern {
    public void pattern(int n){
        // number of row is equal to the number given as the input
        for(int row = 1 ; row <= n ; row++){
            // for every row how the column should look and print.
            for(int col = 1 ; col <= row ; col++){
                System.out.print("*" + " ");
            }
            // when column is printed as needed we move to the next line for the next row.
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern ob = new Pattern();
        ob.pattern(n);
    }
}
