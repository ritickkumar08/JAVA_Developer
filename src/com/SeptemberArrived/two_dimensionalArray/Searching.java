package com.SeptemberArrived.two_dimensionalArray;

import java.util.Arrays;

public class Searching {
    int[] index(int[][] arr, int target){
        int row = 0;
        int column = arr.length - 1;

        while(row < arr.length && column >= 0){
            if(arr[row][column] == target){
                return new int[]{row,column};
            }
            if(arr[row][column] < target){
                row ++;
            }
            else{
                column --;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,  3,  5,  7},
                {2,  6,  8, 10},
                {4,  9, 12, 14},
                {11, 13, 15, 16}
        };
        int target = 16;

        Searching ob = new Searching();
        int[] in = ob.index(arr,target);
        System.out.println(Arrays.toString(in));
    }
}
