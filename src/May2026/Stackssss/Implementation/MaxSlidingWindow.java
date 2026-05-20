package May2026.Stackssss.Implementation;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1,-1};
        int k = 1;

        MaxSlidingWindow ob = new MaxSlidingWindow();
        int[] ans = ob.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-(k-1)];
        for (int i = 0; i < n-(k-1); i++) {
            int maxi = nums[i];
            for (int j = i; j < k+i; j++) {
                maxi = Math.max(nums[j], maxi);
            }
            ans[i] = maxi;
        }
        return ans;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int j = 0;
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            // Remove smaller values from the back of deque
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Add to result once the first window is formed
            if (i >= k-1){
                ans[j++] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}