package Resume.November2026.DynamicProgramming;

import java.util.Arrays;

class NinjaTraining {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {10, 40, 70},
                        {20, 50, 80},
                        {30, 60, 90},
                        {70, 40, 10},
                        {180, 20, 5},
                        {200, 60, 30}
                };

        NinjaTraining ob = new NinjaTraining();
        int ans1 = ob.ninjaTraining1(matrix);
        int ans = ob.ninjaTraining(matrix);
        System.out.println(ans);
        System.out.println(ans1);
    }
    public int ninjaTraining1(int[][] matrix) {
        int n = matrix.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(matrix,n-1, 3, dp);
    }

    private int solve(int[][] mat, int day, int lastTask, int[] dp) {
        if(day == 0){
            int maxi = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                if(i != lastTask){
                    maxi = Math.max(maxi, mat[0][i]);
                }
            }
            dp[day] = maxi;
        }

        if(dp[day] != -1){
            return dp[day];
        }

        int maxi = 0;
        for (int activity = 0; activity < 3; activity++) {
            if(activity != lastTask){
                int points = mat[day][activity] + solve(mat, day-1, activity, dp);
                maxi = Math.max(maxi, points);
            }

        }
        dp[day] = maxi;
        return dp[day];
    }

    public int ninjaTraining2(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][4];

        dp[0][0] = Math.max(matrix[0][1], matrix[0][2]);
        dp[0][1] = Math.max(matrix[0][0], matrix[0][2]);
        dp[0][2] = Math.max(matrix[0][0], matrix[0][1]);
        dp[0][3] = Math.max(matrix[0][0], Math.max(matrix[0][1], matrix[0][2]));


        for (int day = 1; day < n; day++) {
            for (int lastTask = 0; lastTask < 4; lastTask++) {
                for (int activity = 0; activity < 3; activity++) {
                    if (lastTask != activity){
                        int points = matrix[day][activity] + dp[day-1][activity];

                        dp[day][lastTask] = Math.max(dp[day][lastTask], points);
                    }

                }
            }
        }

        return dp[n-1][3];
    }

    public int ninjaTraining(int[][] matrix) {
        int n = matrix.length;
        int[] prev = new int[4];

        prev[0] = Math.max(matrix[0][1], matrix[0][2]);
        prev[1] = Math.max(matrix[0][0], matrix[0][2]);
        prev[2] = Math.max(matrix[0][0], matrix[0][1]);
        prev[3] = Math.max(matrix[0][0], Math.max(matrix[0][1], matrix[0][2]));


        for (int day = 1; day < n; day++) {
            int[] current = new int[4];
            for (int lastTask = 0; lastTask < 4; lastTask++) {
                for (int activity = 0; activity < 3; activity++) {
                    if (lastTask != activity){
                        int points = matrix[day][activity] + prev[activity];

                        current[lastTask] = Math.max(current[lastTask], points);
                    }

                }
            }
            prev = current;
        }

        return prev[3];
    }
}