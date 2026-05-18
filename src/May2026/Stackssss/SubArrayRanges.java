package May2026.Stackssss;

import java.util.Stack;

class SubArrayRanges {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        SubArrayRanges ob = new SubArrayRanges();
        long ans = ob.subArrayRanges(nums);
        System.out.println(ans);
    }
    public long subArrayRanges1(int[] nums) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int mini = nums[i];
            int maxi = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                mini = Math.min(mini, nums[j]);
                maxi = Math.max(maxi, nums[j]);

                sum += (maxi-mini);
            }
        }
        return sum;
    }
    
    //==============================================================================================================
    
    public long subArrayRanges(int[] nums) {
        return sumOfSubArrayMaxs(nums) - sumOfSUbArrayMins(nums);
    }

    private long sumOfSUbArrayMins(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] nse = findNextSmaller(nums,n);
        int[] pse = findPreviousSmaller(nums,n);

        for (int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            long freq = 1L * left * right;
            sum += freq * nums[i];
        }
        return sum;
    }

    private long sumOfSubArrayMaxs(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] nge = findNextGreater(nums,n);
        int[] pge = findPreviousGreater(nums,n);

        for (int i = 0; i < n; i++) {
            int left = i - pge[i];
            int right = nge[i] - i;
            long freq = 1l * left * right;
            sum += freq * nums[i];
        }

        return sum;
    }

    private int[] findPreviousGreater(int[] nums,int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    // Next Greater Element (strict) → use index n as default
    private int[] findNextGreater(int[] nums, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n-1 ; i >= 0 ; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }

    // Function to find Previous Smaller or Equal Elements
    private int[] findPreviousSmaller(int[] nums, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n ; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    // Function to find Next Smaller Elements
    private int[] findNextSmaller(int[] nums, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = n-1 ; i >= 0 ; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
}