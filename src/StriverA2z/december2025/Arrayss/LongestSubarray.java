package StriverA2z.december2025.Arrayss;

import java.util.Arrays;
import java.util.HashMap;

class LongestSubarray {
    public static void main(String[] args) {
        int[] nums ={10, 5, 2, 7, 1, -10};
        int k = 15;
        LongestSubarray ob = new LongestSubarray();
        int len = ob.longestSubarray1(nums,k);
        System.out.println(len);
    }
    public int longestSubarray(int[] arr, int k) {
        int maxLenght = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int len = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k){
                    len = j+1-i;
                }
            }
            maxLenght = Math.max(maxLenght,len);
        }
        return maxLenght;
    }
    public int longestSubarray1(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == k){
                maxLength = i+1;
            }

            if(map.containsKey(sum - k)){
                int len = i - map.get(sum-k);
                maxLength = Math.max(maxLength,len);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}
