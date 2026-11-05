package Resume.November2026.DynamicProgramming;

import com.NovemberHeHe.AddBinary;

import java.util.Arrays;

class MinFallingPathSum {
    public static void main(String[] args) {
        int[][] mat = {
                {2,1,3},
                {6,5,4},
                {7,8,9}
        };

        MinFallingPathSum ob = new MinFallingPathSum();
        int ans = ob.minFallingPathSum1(mat);
        System.out.println(ans);
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int ans = 100000000;
        int[][] dp = new int[n][n];

        for (int[] row : dp){
            Arrays.fill(row, 100000000);
        }

        for (int col = 0; col < n; col++) {
            int pathSum = solve(0, col, n, matrix, dp);
            ans = Math.min(ans, pathSum);
        }

        return ans;
    }

    private int solve(int row, int col, int n, int[][] matrix, int[][] dp) {
        if (col < 0 || col >= n){
            return 100000000;
        }
        if(row == n-1){
            return matrix[row][col];
        }

        if(dp[row][col] != 100000000){
            return dp[row][col];
        }

        int left = solve(row+1, col-1, n, matrix, dp);
        int down = solve(row+1, col, n, matrix, dp);
        int right = solve(row+1, col+1, n, matrix, dp);

        int mini = Math.min(left, Math.min(down, right));

        dp[row][col] = matrix[row][col] + mini;
        return dp[row][col];
    }

    public int minFallingPathSum1(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i];
        }

        for (int row = 1; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int left = (col>0) ? dp[row-1][col-1] : Integer.MAX_VALUE;
                int down = dp[row-1][col];
                int right = (col < n-1) ? dp[row-1][col+1] : Integer.MAX_VALUE;

                dp[row][col] = matrix[row][col] + Math.min(left, Math.min(down, right));
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, dp[n-1][i]);
        }

        return ans;
    }
}