package StriverA2z.december2025.Arrayss;

import java.util.Arrays;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        LeftRotateBy1 ob = new LeftRotateBy1();
        ob.leftRotateBy1(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void leftRotateBy1(int[] nums) {
        int n = nums.length;

        reverse(nums,0,n-1);
        reverse(nums,1,n-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
