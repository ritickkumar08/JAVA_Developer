package com.SeptemberArrived;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        // int[] index = new int[2];

        for(int i = 0 ; i < n ; i++){
            int complement = target - numbers[i];
            int start = i + 1;
            int end = n - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(numbers[mid] == complement) return new int[] {i+1,mid+1};
                else if(complement > numbers[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        TwoSum ob = new TwoSum();
        int[] ind = ob.twoSum(arr,target);
        System.out.println(Arrays.toString(ind));
    }
}
