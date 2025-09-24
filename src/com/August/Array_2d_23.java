package com.August;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2d_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
