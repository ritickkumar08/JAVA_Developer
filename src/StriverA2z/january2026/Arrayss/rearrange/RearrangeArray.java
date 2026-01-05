package StriverA2z.january2026.Arrayss.rearrange;

import java.util.Arrays;

class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        RearrangeArray ob = new RearrangeArray();
        int[] arranged = ob.rearrangeArray(nums);
        System.out.println(Arrays.toString(arranged));
    }
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arranged = new int[n];
        int positive = 0;
        int negative = 1;

        for (int i = 0; i < n; i++) {
            if(nums[i] > 0){
                arranged[positive] = nums[i];
                positive += 2;
            }if(nums[i] < 0){
                arranged[negative] = nums[i];
                negative += 2;
            }
        }

        return arranged;
    }
}