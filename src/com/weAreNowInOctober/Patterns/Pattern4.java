package com.weAreNowInOctober.Patterns;

import java.util.Scanner;

public class Pattern4 {
    private void pattern(int n) {
        for(int row = 1 ; row <= n ; row++){
           for(int col = 1 ; col <= n ; col++){
               if(col <= n - row){
                   System.out.print(" ");
               }else{
                   System.out.print("*");
               }
           }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern4 ob = new Pattern4();
        ob.pattern(n);
    }
}
