package Resume.November2026.DynamicProgramming;

import java.util.Arrays;

class UniquePaths1 {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;

        UniquePaths1 ob = new UniquePaths1();
        int paths = ob.uniquePaths(m, n);
        System.out.println(paths);
    }
    public int uniquePaths(int m, int n) {
//        return uniquePaths(m-1,n-1, m, n);
        int[][] dp = new int[m][n];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return uniquePathsMemo(m-1,n-1, dp);
    }
    private int uniquePaths(int row, int col, int m, int n){
        if(row == 0 && col == 0){
            return 1;
        }
        if(row < 0 || col < 0){
            return 0;
        }

        int down = uniquePaths(row-1, col, m, n);
        int right = uniquePaths(row, col-1, m, n);

        return down+right;
    }
    private int uniquePathsMemo(int row, int col,int[][] dp){
        if(row == 0 && col == 0){
            return 1;
        }
        if(row < 0 || col < 0){
            return 0;
        }
        if(dp[row][col] != -1) {
            return dp[row][col];
        }

        int up = uniquePathsMemo(row-1, col, dp);
        int left = uniquePathsMemo(row, col-1, dp);

        dp[row][col] = up+left;
        return dp[row][col];
    }
}