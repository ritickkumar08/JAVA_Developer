package StriverA2z.january2026.Arrayss.HARD.Sums;

import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3, 1};
        int target = -2;
        TwoSum ob = new TwoSum();
        boolean yes = ob.twoSum(nums,target);
        System.out.println(yes);
    }
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return true;
            }

            map.put(arr[i], i);
        }
        return false;
    }
}