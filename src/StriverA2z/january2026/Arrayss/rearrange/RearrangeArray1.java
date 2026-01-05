package StriverA2z.january2026.Arrayss.rearrange;

import java.util.Arrays;

public class RearrangeArray1 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        RearrangeArray1 ob = new RearrangeArray1();
        int[] arranged = ob.rearrangeArray(nums);
        System.out.println(Arrays.toString(arranged));
    }
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int positive = 0;
        int negative = 1;
        for (int i = 0; i < n; i++) {
            if(nums[i] > 0 && positive < n){
                swap(nums,i,positive);
                positive += 2;
            }
            if(nums[i] < 0 && negative < n){
                swap(nums,i,negative);
                negative += 2;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
