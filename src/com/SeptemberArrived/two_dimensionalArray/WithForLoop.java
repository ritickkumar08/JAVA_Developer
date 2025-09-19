package com.SeptemberArrived.two_dimensionalArray;

import java.util.Arrays;

public class WithForLoop {
    private int[] index(int[][] arr,int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] == target) return new int[] {i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,  3,  5,  7},
                {2,  6,  8, 10},
                {4,  9, 12, 14},
                {11, 13, 15, 16}
        };
        int target = 16;

        WithForLoop ob = new WithForLoop();
        int[] in = ob.index(arr,target);
        System.out.println(Arrays.toString(in));
    }
}
