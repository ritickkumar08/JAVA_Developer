package May2026.Stackssss;

import java.util.Stack;

class SumSubarrayMins {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};

        SumSubarrayMins ob = new SumSubarrayMins();
        int ans = ob.sumSubarrayMins(arr);
        System.out.println(ans);
    }
    public int sumSubarrayMins1(int[] arr) {
        int sum = 0;
        int mod = (int)1e9 + 7;

        for (int i = 0; i < arr.length; i++) {
            int mini = arr[i];
            for (int j = i; j < arr.length; j++) {
                mini = Math.min(mini, arr[j]);


                sum = (sum + mini) % mod;
            }
        }
        return sum;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNextSmaller(arr);
        int[] pse = findpreviousSmaller(arr);
        int sum = 0;
        int mod = (int)1e9 + 7;

        for (int i = 0; i < arr.length; i++) {
            // Count of elements to the left including current
            int left = i - pse[i];

            // Count of elements to the right including current
            int right = nse[i] - i;

            // Total subarrays where arr[i] is the minimum
            long freq = left * right * 1L;

            // Contribution = frequency * value
            int val = (int)((freq * arr[i]) % mod);

            // Add contribution to sum
            sum = (sum + val) % mod;
        }
        return sum;
    }

    private int[] findpreviousSmaller(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse array from left to right
        for (int i = 0; i < n; i++) {
            // Pop elements greater than current
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            // If stack is empty, PSEE doesn't exist → set to -1
            pse[i] = st.isEmpty() ? -1 : st.peek();
            // Push current index to stack
            st.push(i);
        }
        return pse;
    }

    private int[] findNextSmaller(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse array from right to left
        for (int i = n-1; i >= 0; i--) {
            // Pop elements that are greater or equal to current
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            // If stack is empty, NSE doesn't exist → set to n
            nse[i] = st.isEmpty() ? n : st.peek();
            // Push current index to stack
            st.push(i);
        }
        return nse;
    }
}