package April2026;

import java.util.HashMap;
import java.util.Scanner;

class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the target to be found : ");
//        int target = sc.nextInt();
//        System.out.println("enter the length of array : ");
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        System.out.println("enter the array elements : ");
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
        int target = -17;
        int[] nums = {-4, -3, 2, -5, -10, -7};

        TwoSum ob = new TwoSum();
        boolean res = ob.twoSum(nums, target);
        System.out.println(res);
    }
    boolean twoSum1(int arr[], int target) {
        if(target == 0 || arr.length < 2){
            return false;
        }
        // code here
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == complement){
                    return true;
                }
            }
        }
        return false;
    }
    boolean twoSum(int arr[], int target) {
        if(arr.length < 2){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        // code here
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}