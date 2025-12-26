package StriverA2z.december2025.Arrayss;

import java.util.Arrays;

class Rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Rotate ob = new Rotate();
        ob.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k =  k % n;
        int[] temp = new int[k];
        int index = 0 ;
        for (int i = n-k; i < n; i++) {
            temp[index++] = nums[i];
        }
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < n-k ; i++) {
            nums[n-i-1] = nums[n-k-1-i];
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}