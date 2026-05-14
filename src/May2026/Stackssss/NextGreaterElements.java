package May2026.Stackssss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class NextGreaterElements {
    public static void main(String[] args) {
        int[] nums = {1,2,1};

        NextGreaterElements ob = new NextGreaterElements();
        int[] ans = ob.nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
    }
    public int[] nextGreaterElements1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i]=-1;
            for (int j = i+1; j < 2*n; j++) {
                if(nums[j%n] > nums[i%n]){
                    ans[i] = nums[j%n];
                    break;
                }
            }
        }
        return ans;
    }
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 2 * n - 1 ; i >= 0; i--) {
            int idx = i % n;

           while (!st.isEmpty() && st.peek() <= nums[idx]){
               st.pop();
           }

           if(i < n){
               ans[idx] = st.isEmpty() ? -1 : st.peek();
           }

           st.push(nums[idx]);
        }


        return ans;
    }
}