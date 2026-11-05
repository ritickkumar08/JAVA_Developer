package Resume.November2026.DynamicProgramming;

import java.util.Arrays;

class UniquePaths {
    public static void main(String[] args) {
        UniquePaths ob = new UniquePaths();
        int ans = ob.uniquePaths(3,3);
        System.out.println(ans);
    }
    public int uniquePaths(int m, int n) {
        return solve1(0, 0, m, n);
    }

    private int solve1(int row, int col, int m, int n) {
        if(row == m-1 && col == n-1){
            return 1;
        }
        if(row >= m || col >= n){
            return 0;
        }

        int downPaths = solve1(row+1, col, m, n);
        int upPaths = solve1(row, col+1, m, n);

        return downPaths+upPaths;
    }

    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m][n];

        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve2(0, 0, m, n, dp);
    }

    private int solve2(int row, int col, int m, int n, int[][] dp) {
        if(row == m-1 && col == n-1){
            return 1;
        }
        if(row >= m || col >= n){
            return 0;
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }

        int downPaths = solve2(row+1, col, m, n, dp);
        int upPaths = solve2(row, col+1, m, n, dp);

        dp[row][col] = downPaths+upPaths;
        return dp[row][col];
    }

//    public int uniquePaths(int m, int n) {
//        int[][] dp = new int[m][n];
//        dp[0][0] = 1;
//
//        for (int i = 1; i < ; i++) {
//
//        }
//    }


}