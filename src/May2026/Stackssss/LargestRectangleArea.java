package May2026.Stackssss;

import java.util.Arrays;
import java.util.Stack;

class LargestRectangleArea {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};

        LargestRectangleArea ob = new LargestRectangleArea();
        int ans = ob.largestRectangleArea(heights);
        System.out.println(ans);
    }
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int left = -1;
            int right = heights.length;

            for (int j = i-1; j >= 0; j--) {
                if (heights[j] < heights[i]){
                    left = j;
                    break;
                }
            }

            for (int j = i+1; j < heights.length ; j++) {
                if (heights[j] < heights[i]){
                    right = j;
                    break;
                }
            }

            int width = right - left - 1;
            System.out.println(width);
            int area = width * heights[i];
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
    public int largestRectangleArea1(int[] heights) {
        int n = heights.length;
        int[] pse = findPreviousSmaller(heights, n);
        int[] nse = findNextSmaller(heights, n);
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;

            int width = right + left -1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    private int[] findPreviousSmaller(int[] heights, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    private int[] findNextSmaller(int[] heights, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}