package May2026;

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

            for (int j = i-1; j >=0 ; j--) {
                if (heights[j] < heights[i]){
                    left = j;
                    break;
                }
            }

            for (int j = i+1; j < heights.length; j++) {
                if (heights[j] < heights[i]){
                    right = j;
                    break;
                }
            }
            int width = right - left - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}