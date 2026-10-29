package Resume.November2026.DynamicProgramming;

import java.util.Arrays;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 9;

        Fibonnaci ob = new Fibonnaci();
        int ans = ob.fibonacci(n);
        int ans2 = ob.fibo(n);
        System.out.println(ans);
        System.out.println(ans2);
    }

    private int fibonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return solve(n, dp);
    }

    private int solve(int n, int[] dp) {
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = solve(n-1, dp) + solve(n-2, dp);

        return dp[n];
    }

    private int fibo(int n){
        int prev2 = 0;
        int prev = 1;

        for(int i = 2; i<= n ; i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

}
