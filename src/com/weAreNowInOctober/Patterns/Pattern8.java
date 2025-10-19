package com.weAreNowInOctober.Patterns;
//         4 4 4 4 4 4 4
//         4 3 3 3 3 3 4
//         4 3 2 2 2 3 4
//         4 3 2 1 2 3 4
//         4 3 2 2 2 3 4
//         4 3 3 3 3 3 4
//         4 4 4 4 4 4 4

import java.util.Scanner;

public class Pattern8 {
    private void pattern(int n) {
        int size = 2*n-1;
        for(int row = 0 ; row < size ; row++){
            for(int col = 0 ; col < size ; col++){
               int top = row;
               int bottom = size - row - 1;
               int left = col;
               int right = size - col - 1;

               int mini = Math.min(Math.min(top,bottom),Math.min(right,left));

                System.out.print((n - mini) + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern8 ob = new Pattern8();
        ob.pattern(n);
    }
}
