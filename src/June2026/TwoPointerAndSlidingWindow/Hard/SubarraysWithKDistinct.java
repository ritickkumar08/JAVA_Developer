package June2026.TwoPointerAndSlidingWindow.Hard;

import java.util.HashMap;
import java.util.HashSet;

class SubarraysWithKDistinct {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4};
        int k = 3;

        SubarraysWithKDistinct ob = new SubarraysWithKDistinct();
        int ans = ob.subarraysWithKDistinct(nums, k);
        System.out.println(ans);
    }
    public int subarraysWithKDistinct1(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() > k) break;

                if (set.size() == k){
                    count++;
                }
            }
        }
        return count;
    }

    //lets try to find the solution using two pointer and sliding window
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);

    }

    private int atMost(int[] nums, int k) {
        int count = 0;
        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k){
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }

            count += right - left +1;
        }
        return count;
    }
}