package StriverA2z.january2026.Arrayss.MEDIUM;

import java.util.HashSet;

class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        LongestConsecutive ob = new LongestConsecutive();
        int length = ob.longestConsecutive(nums);
        System.out.println(length);
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){ return 0; }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;

        for (int num : set){
            if(!set.contains(num-1)){
                int len = 1;
                int curr = num;

                while(set.contains(curr + 1)){
                    curr++;
                    len ++;
                }
                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
    
}