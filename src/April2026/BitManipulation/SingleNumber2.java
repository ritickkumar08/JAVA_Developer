package April2026.BitManipulation;

import java.util.HashMap;
import java.util.Map;

class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {};

        SingleNumber2 ob = new SingleNumber2();
        int number = ob.singleNumber(nums);
        System.out.println(number);
    }
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}