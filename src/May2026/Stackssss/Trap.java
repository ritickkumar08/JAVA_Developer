package May2026.Stackssss;

import java.util.Arrays;

class Trap {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};

        Trap ob = new Trap();
        int ans = ob.trap(height);
        System.out.println(ans);
    }
    public int trap1(int[] height) {
        int n = height.length;
        int[] prefixMax = new int[n];
        int[] sufixMax = new int[n];
        int total = 0;

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(height[i], max);
            prefixMax[i] = max;
        }
        System.out.println(Arrays.toString(prefixMax));
        max = 0;
        for (int i = n-1; i >= 0; i--) {
            max = Math.max(max,height[i]);
            sufixMax[i] = max;
        }
        System.out.println(Arrays.toString(sufixMax));


        for (int i = 0; i < n; i++) {
            if (height[i] < prefixMax[i] && height[i] < sufixMax[i]){
                total += Math.min(prefixMax[i], sufixMax[i]) - height[i];
            }
        }
        return total;
    }

    public int trap2(int[] height) {
        int n = height.length;
        int prefixMax = 0;
        int[] sufixMax = new int[n];
        int total = 0;

        int max = 0;
//        for (int i = 0; i < n; i++) {
//            max = Math.max(height[i], max);
//            prefixMax[i] = max;
//        }
//        System.out.println(Arrays.toString(prefixMax));
//        max = 0;
        for (int i = n-1; i >= 0; i--) {
            max = Math.max(max,height[i]);
            sufixMax[i] = max;
        }
        System.out.println(Arrays.toString(sufixMax));


        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, height[i]);
            if (height[i] < prefixMax && height[i] < sufixMax[i]){
                total += Math.min(prefixMax, sufixMax[i]) - height[i];
            }
        }
        return total;
    }
    public int trap(int[] height) {
        int n = height.length;
        int lMax = 0, rMax = 0, total = 0;
        int left = 0;
        int right = n - 1;

        while (left < right){
            if (height[left] <= height[right]){
                if (height[left] > lMax){
                    lMax = height[left];
                }else {
                    total += lMax-height[left];
                }
                left++;
            }else {
                if (height[right] > rMax){
                    rMax = height[right];
                }else {
                    total += rMax - height[right];
                }
                right--;
            }
        }
        return total;
    }
}