package StriverA2z.december2025.Arrayss;

import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int[] nums = {1,2,3,45,6};
        int[] nums1 = {9,8,5,0,4,3,8,6,0,8,3};
        Union ob = new Union();
        int[] union = ob.unioned(nums, nums1);
        System.out.println(Arrays.toString(union));
    }

    private int[] unioned(int[] nums, int[] nums1) {
        int newLength = nums.length + nums1.length;
        int[] newArray = new int[newLength];
        System.arraycopy(nums, 0, newArray, 0, nums.length);
        System.arraycopy(nums1, 0, newArray, nums.length, nums1.length );

        return newArray;
    }
}
