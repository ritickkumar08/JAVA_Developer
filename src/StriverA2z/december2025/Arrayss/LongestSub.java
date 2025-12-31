package StriverA2z.december2025.Arrayss;

import java.util.HashMap;

public class LongestSub {
    public static void main(String[] args) {
        int[] nums ={10, 5, 2, 7, 1, -10};
        int k = 10;
        LongestSub ob = new LongestSub();
        int len = ob.longestSubarray(nums,k);
        System.out.println(len);

        HashMap<Integer, Integer> map = ob.longestSubarray1(nums,k);
        System.out.println(map);
    }

    private int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == k){
                maxLen = i + 1;
            }

            if(map.containsKey(sum - k)){
                int len = i - map.get(sum - k);
                maxLen = Math.max(len, maxLen);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }

        return maxLen;
    }
    private HashMap longestSubarray1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == k){
                maxLen = i + 1;
            }

            if(map.containsKey(sum - k)){
                int len = i - map.get(sum - k);
                maxLen = Math.max(len, maxLen);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }

        return map;
    }
}
