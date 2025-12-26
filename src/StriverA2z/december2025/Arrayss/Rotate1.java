package StriverA2z.december2025.Arrayss;

import java.util.Arrays;

public class Rotate1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Rotate1 ob = new Rotate1();
        ob.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k =  k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    private void reverse(int[] nums, int start, int end) {
        int left = start;
        int right = end;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
