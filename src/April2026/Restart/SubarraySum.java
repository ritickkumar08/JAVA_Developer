package April2026.Restart;

import java.util.HashMap;

class SubarraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;

        SubarraySum ob = new SubarraySum();
        int n = ob.subarraySum(nums,k);
        System.out.println(n);
    }
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    //a better solution but not the optimal as the time complexity of the code is n^2.
    public int subarraySum2(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    //this is the absolute brute force, wherein we find all the subarrays and the time complexity for the approach is
    //O(n^3), which will obiviously not be considered a good solution.
    //so to better the approach we can remove the l loop.
    public int subarraySum1(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += nums[l];
                }
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}