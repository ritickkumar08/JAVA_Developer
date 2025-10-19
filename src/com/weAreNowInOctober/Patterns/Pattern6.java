package com.weAreNowInOctober.Patterns;
//         *
//        * *
//       *   *
//      *     *
//     *********

import java.util.Scanner;

public class Pattern6 {
    private void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            // print leading spaces
            for (int space = n - row; space > 0; space--) {
                System.out.print("  ");
            }

            // print stars
            for (int col = 1; col <= (2 * row - 1); col++) {
                if (row == n || col == 1 || col == (2 * row - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern6 ob = new Pattern6();
        ob.pattern(n);
    }
}
