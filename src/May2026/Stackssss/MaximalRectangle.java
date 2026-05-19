package May2026.Stackssss;

import java.util.Arrays;
import java.util.Stack;

class MaximalRectangle {
    public static void main(String[] args) {
        char[][] matrix =
                {
                        {'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'}
                };
        MaximalRectangle ob = new MaximalRectangle();
        int ans = ob.maximalRectangle(matrix);
        System.out.println(ans);
    }
    public int maximalRectangle(char[][] matrix) {
        // Return 0 if matrix is empty
        if (matrix.length == 0) return 0;

        // Column count
        int m = matrix[0].length;
        int maxArea = 0;

        // Histogram array
        int[] height = new int[m];

        // Iterate each row
        for (char[] row : matrix) {
            // Update histogram
            for (int i = 0; i < m; i++) {
                if (row[i] == '1') height[i]++;
                else height[i] = 0;
            }

            maxArea = Math.max(maxArea, largestRectangleArea(height));
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
//        System.out.println(Arrays.toString(ans));
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
//        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            // When current bar is less than the bar on top of stack, calculate area (i == n || heights[stack.peek()] >= (i < n ? heights[i] : 0))
            while (!st.isEmpty() && (i == n || heights[st.peek()] >=  (i<n ? heights[i] : 0))){
                int height = heights[st.pop()];

                int width;
                if (st.isEmpty()){
                    width = i;
                }else {
                    width = i-st.peek()-1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        return maxArea;
    }
}