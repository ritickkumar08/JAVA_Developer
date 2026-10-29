package Resume.November2026.DynamicProgramming;

import java.util.Arrays;

class FrogJump {
    public static void main(String[] args) {
        int[] heights = {7, 5, 1, 2, 6};

        FrogJump ob = new FrogJump();
        int jumps = ob.frogJump(heights);
        System.out.println(jumps);
    }
    public int frogJump(int[] heights) {
        int n = heights.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return solve(n-1, dp, heights);
    }
    private int solve(int index, int[] dp, int[] heights){
        if(index == 0){
            return 0;
        }

        if (dp[index] != -1){
            return dp[index];
        }

        int oneStep = Math.abs(heights[index] - heights[index-1]);
        int oneStepJump = solve(index-1, dp, heights) + oneStep;

        int twoStepJump = Integer.MAX_VALUE;
        if(index > 1){
            int twoStep = Math.abs(heights[index] - heights[index-2]);

            twoStepJump = solve(index-2, dp, heights) + twoStep;
        }

        dp[index] = Math.min(twoStepJump, oneStepJump);
        return dp[index];
    }
}