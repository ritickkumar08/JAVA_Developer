package StriverA2z.december2025.Arrayss;

import java.util.Arrays;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates ob = new RemoveDuplicates();
        int removed = ob.removeDuplicates(nums);
        System.out.println(removed);

    }
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}