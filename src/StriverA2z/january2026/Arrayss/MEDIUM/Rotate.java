package StriverA2z.january2026.Arrayss.MEDIUM;

import java.util.Arrays;

class Rotate {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Rotate ob = new Rotate();
        ob.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public void rotate1(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][col-j-1] = matrix[j][i];
            }
        }
        System.out.println(Arrays.deepToString(answer));
    }


    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1 ; j < n; j++) {
                  swap(matrix, i, j, j, i);
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0, right = n-1;
            while (left < right){
                swap(matrix, i, left, i, right);
                left++;
                right--;
            }
        }

    }

    private void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }
}