package Resume.November2026.DynamicProgramming;

import java.util.Arrays;

class MinPathSum {
    public static void main(String[] args) {
        int[][] grid= {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        MinPathSum ob = new MinPathSum();
        int ans = ob.minPathSum2(grid);
        System.out.println(ans);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        return solve(0, 0, m, n, grid);
    }

    private int solve(int row, int col, int m, int n, int[][] grid) {
        if(row == m-1 && col == n-1){
            return grid[row][col];
        }
        if(row >= m || col >= n){
            return 10000000;
        }

        int right = solve(row, col+1, m, n, grid);
        int down = solve(row+1, col, m, n, grid);

        int bestNext = Math.min(right, down);
        return grid[row][col] + bestNext;
    }

    public int minPathSum1(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for(int[] row: dp){
            Arrays.fill(row, 10000000);
        }

        return solve(0, 0, m, n, grid, dp);
    }

    private int solve(int row, int col, int m, int n, int[][] grid, int[][] dp) {
        if(row == m-1 && col == n-1){
            return grid[row][col];
        }
        if(row >= m || col >= n){
            return 10000000;
        }

        if(dp[row][col] != 10000000){
            return dp[row][col];
        }

        int right = solve(row, col+1, m, n, grid, dp);
        int down = solve(row+1, col, m, n, grid, dp);

        int bestNext = Math.min(right, down);
        dp[row][col] =  grid[row][col] + bestNext;
        return dp[row][col];
    }


    public int minPathSum2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 && col == 0) {
                    dp[row][col] = grid[row][col]; // Starting point
                } else {
                    int up = (row > 0) ? dp[row - 1][col] : Integer.MAX_VALUE;
                    int left = (col > 0) ? dp[row][col - 1] : Integer.MAX_VALUE;

                    dp[row][col] = grid[row][col] + Math.min(up, left);
                }
            }
        }

        return dp[m-1][n-1];
    }
}