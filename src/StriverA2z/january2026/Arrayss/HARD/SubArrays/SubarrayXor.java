package StriverA2z.january2026.Arrayss.HARD.SubArrays;

import java.util.HashMap;

class SubarrayXor {
    public static void main(String[] args) {
        int[] nums ={4, 2, 2, 6, 4};
        int k = 6;
        SubarrayXor ob = new SubarrayXor();
        long number = ob.subarrayXor(nums,k);
        System.out.println(number);
    }
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map  =new HashMap<>();
        map.put(0,1);
        long number = 0;
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];

            int target = xor^k;

            if(map.containsKey(target)){
                number += map.get(target);
            }

            map.put(xor, map.getOrDefault(xor,0)+1);
        }

        return number;
    }
}