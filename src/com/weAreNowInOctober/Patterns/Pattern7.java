package com.weAreNowInOctober.Patterns;
//            1
//          2 1 2
//        3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5
import java.util.Scanner;

public class Pattern7 {
    private void pattern(int n) {
        for (int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= n - row ; col++){
                System.out.print("  ");
            }
            for(int col = row; col > 0 ; col--){
                System.out.print(col + " ");
            }
            for(int col = 1 ; col < row ; col++){
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern7 ob = new Pattern7();
        ob.pattern(n);
    }
}
