package com.LetsGrindTheHellOutOfDecember;

import java.util.Arrays;

class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        SetZeroes ob = new SetZeroes();
        ob.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public void setZeroes1(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean[][] visited = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] == 0 && !visited[i][j]){
                    for(int k = 0; k< row ; k++){
                        matrix[k][j] = 0;
                        visited[k][j] = true;
                    }
                    for (int k = 0; k < column; k++) {
                        matrix[i][k] = 0;
                        visited[i][k] = true;
                    }
                }
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean[] zeroRow = new boolean[row];
        boolean[] zeroColumn = new boolean[column];
        
        //marking the rows and columns with 0 in it.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroColumn[j] = true;
                }
            }
        }
        //putting zeros now.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(zeroRow[i] || zeroColumn[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}