package StriverA2z.january2026.Arrayss;

import java.util.Arrays;

class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        SetZeroes ob = new SetZeroes();
        ob.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean[] zeroRow = new boolean[row];
        boolean[] zeroCol = new boolean[column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(zeroRow[i] || zeroCol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}