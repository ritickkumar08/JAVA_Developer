package StriverA2z.january2026.Arrayss;

import java.util.Arrays;

class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        LongestConsecutive ob = new LongestConsecutive();
        int length = ob.longestConsecutive(nums);
        System.out.println(length);
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        int length = 1;
        for (int j = 1; j < nums.length ; j++) {
            if(nums[j - 1] + 1 == nums[j]){
                length++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return length;
    }
    
}