package StriverA2z.december2025.Arrayss;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        TwoSum ob = new TwoSum();
        int[] answer = ob.twoSum1(nums,target);
        System.out.println(Arrays.toString(answer));
        boolean ye = ob.twoSum2(nums,target);
        System.out.println(ye);
    }
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i] ;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == complement){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int first = -1;
        int second = -1;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i] ;
            if(map.containsKey(complement)){
                first = i;
                second = map.get(complement);
            }

            map.put(nums[i], i);
        }
        return new int[] {first, second};
    }
    boolean twoSum2(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i] ;
            if(map.containsKey(complement)){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}