package Resume.November2026.DynamicProgramming;

import java.util.Arrays;

class ClimbStairs {
    public static void main(String[] args) {
        int n = 4;
        ClimbStairs ob = new ClimbStairs();
        int ans = ob.climbStairs(n);
        System.out.println(ans);
    }
    public int climbStairs1(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
    private int solve(int n, int[] dp){
        if(n <= 2){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = solve(n-1, dp) + solve(n-2, dp);

        return dp[n];
    }

    public int climbStairs(int n) {
        if(n <= 2) return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}