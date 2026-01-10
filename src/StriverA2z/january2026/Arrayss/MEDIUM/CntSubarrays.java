package StriverA2z.january2026.Arrayss.MEDIUM;

import java.util.HashMap;

class CntSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        CntSubarrays ob = new CntSubarrays();
        int number = ob.cntSubarrays(nums,k);
        System.out.println(number);
    }
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;

        for(int num : arr){
            sum += num;

            //previousSum - currentSum = k so,
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum,0) + 1);
        }

        return count;
    }


    public int cntSubarrays1(int[] arr, int k) {
        // code here
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k){
                    count ++;
                }
            }
        }
        return count;
    }
}