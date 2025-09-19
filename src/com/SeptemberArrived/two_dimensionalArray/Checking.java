package com.SeptemberArrived.two_dimensionalArray;

import java.util.Arrays;

public class Checking {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return true;
            }
            if(matrix[row][column] < target){
                row ++;
            }
            else{
                column --;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,  3,  5,  7},
//                {2,  6,  8, 10},
//                {4,  9, 12, 14},
//                {11, 13, 15, 16}
//        };
//        int target = 16;
        int[][] arr = { {1,3}};
        int target = 3;

        Checking ob = new Checking();
        boolean in = ob.searchMatrix(arr,target);
        System.out.println(in);
    }
}
