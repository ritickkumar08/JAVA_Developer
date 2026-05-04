package April2026.BitManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SingleNumber3 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,3,5};

        SingleNumber3 ob = new SingleNumber3();
        int[] ans = ob.singleNumber(nums);
        System.out.println(Arrays.toString(ans));
    }
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2){
            return nums;
        }

        int[] ans = new int[2];
        int j = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
                freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() % 2 == 1){
                ans[j++] = entry.getKey();
            }
        }
        return ans;
    }
}