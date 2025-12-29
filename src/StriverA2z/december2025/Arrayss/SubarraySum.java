package StriverA2z.december2025.Arrayss;

import java.util.HashMap;

class SubarraySum {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, -10};
        int k = 15;
        SubarraySum ob = new SubarraySum();
        int arr = ob.subarraySum(nums,k);
        System.out.println(arr);
    }
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int count = 0;

        for(int num : nums){
            sum += num;

            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
            System.out.println(map);
        }

        return count;
    }
    public int subarraySum1(int[] nums, int k) {
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
}