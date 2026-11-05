package Resume.November2026.DynamicProgramming;

import java.util.Arrays;

class UniquePathsWithObstacles {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

        UniquePathsWithObstacles ob = new UniquePathsWithObstacles();
        int paths = ob.uniquePathsWithObstacles(matrix);
        int paths1 = ob.uniquePathsWithObstacles1(matrix);
        int paths2 = ob.uniquePathsWithObstacles2(matrix);
        System.out.println(paths2);
        System.out.println(paths1);
        System.out.println(paths);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return uniquePaths(0, 0, m, n, obstacleGrid);
    }

    private int uniquePaths(int row, int col, int m, int n, int[][] obstacleGrid) {
        if(row >= m || col >= n || obstacleGrid[row][col] == 1){
            return 0;
        }
        if (row == m-1 && col == n-1){
            return 1;
        }
        int right = uniquePaths(row, col+1, m, n, obstacleGrid);
        int down = uniquePaths(row+1, col, m, n, obstacleGrid);

        return right+down;
    }

    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return uniquePaths1(0, 0, m, n, obstacleGrid, dp);
    }

    private int uniquePaths1(int row, int col, int m, int n, int[][] obstacleGrid, int[][] dp) {
        if(row >= m || col >= n || obstacleGrid[row][col] == 1){
            return 0;
        }
        if (row == m-1 && col == n-1){
            return 1;
        }
        if (dp[row][col] != -1){
            return dp[row][col];
        }
        int right = uniquePaths1(row, col+1, m, n, obstacleGrid, dp);
        int down = uniquePaths1(row+1, col, m, n, obstacleGrid, dp);

        dp[row][col] = right+down;
        return dp[row][col];
    }

    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = 1;
                }else if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else {
                    int left = (j > 0) ? dp[i][j-1] : 0;
                    int up = (i > 0) ? dp[i-1][j] : 0;

                    dp[i][j] = left+up;
                }
            }
        }
        return dp[m-1][n-1];
    }
}