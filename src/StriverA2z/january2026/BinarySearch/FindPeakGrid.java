package StriverA2z.january2026.BinarySearch;

import java.util.Arrays;

class FindPeakGrid {
    public static void main(String[] args) {
        int[][] matrix = {
                {-1, -1, -1, -1, -1, -1, -1},
                {-1, 10,  8, 10, 10,  7, -1},
                {-1, 14, 13, 12, 11,  9, -1},
                {-1, 15,  9, 11, 21, 10, -1},
                {-1, 16, 17, 19, 20, 18, -1},
                {-1, 5,  4,  3,  2,  1, -1},
                {-1, -1, -1, -1, -1, -1, -1},
        };
        int[][] matrix1 ={
                {-1, -1, -1, -1},
                {-1, 1, 4, -1},
                {-1, 3, 2, -1},
                {-1, -1, -1, -1},
        };
        FindPeakGrid ob = new FindPeakGrid();
        int[] peak = ob.findPeakGrid(matrix);
        System.out.println(Arrays.toString(peak));

        int[] peak1 = ob.findPeakGrid1(matrix1);
        System.out.println(Arrays.toString(peak1));
    }
    public int[] findPeakGrid1(int[][] mat) {
        int n = mat.length;
        int[] ans = new int[2];

        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                if(mat[i][j] > mat[i-1][j] && mat[i][j] > mat[i+1][j]){
                    if(mat[i][j] > mat[i][j-1] && mat[i][j] > mat[i][j+1]){
                        return new int[] {i,j};
                    }
                }
            }
        }

        return ans;
    }

    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            //find the maximum element in the row
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if(mat[i][mid] > mat[maxRow][mid]){
                    maxRow = i;
                }
            }

            //getting the left and right value for the maximum element of the row
            int leftVal = (mid-1 >= 0) ? mat[maxRow][mid-1] : -1;
            int rightVal = (mid+1 <= n) ? mat[maxRow][mid+1] : -1;

            //checking if the current element is greater to the left and right values of the row
            if(mat[maxRow][mid] > leftVal && mat[maxRow][mid] > rightVal){
                return new int[] {maxRow,mid};
            }

            if(leftVal > mat[maxRow][mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}