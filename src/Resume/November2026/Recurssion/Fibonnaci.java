package Resume.November2026.Recurssion;

import java.util.Arrays;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        int[] dp1 = new int[n+1];
        Arrays.fill(dp1, -1);

        Fibonnaci ob = new Fibonnaci();
        int ans = ob.fibonacciRecurssive(n);
        int ans2 = ob.fibonacciMemoization(n, dp);
        int ans3 = ob.fibonacciTabulation(n, dp1);
        int ans4 = ob.fibonacciSpace(n);
        System.out.println(ans4);
        System.out.println(ans3);
        System.out.println(ans2);
        System.out.println(ans);
    }

    private int fibonacciSpace(int n) {
        int prev = 1;
        int prev1 = 0;

        for(int i = 2; i<=n; i++){
            int curr = prev + prev1;
            prev1 = prev;
            prev = curr;
        }
        return prev;
    }

    private int fibonacciTabulation(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    private int fibonacciRecurssive(int n) {
        if(n <= 1){
            return n;
        }
        return fibonacciRecurssive(n-1) + fibonacciRecurssive(n-2);
    }

    private int fibonacciMemoization(int n, int[] dp){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = fibonacciMemoization(n-1, dp) + fibonacciMemoization(n-2, dp);
        return dp[n];
    }


}
