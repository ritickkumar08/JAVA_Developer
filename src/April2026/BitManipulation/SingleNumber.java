package April2026.BitManipulation;

import java.util.HashMap;
import java.util.Map;

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

        SingleNumber ob = new SingleNumber();
        int number = ob.singleNumber(nums);
        System.out.println(number);
    }
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return 0;
    }
}