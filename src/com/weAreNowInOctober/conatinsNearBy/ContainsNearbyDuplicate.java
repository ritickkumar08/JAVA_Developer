package com.weAreNowInOctober.conatinsNearBy;

public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] arr,  int k) {
        int[] indices = (findingIndices(arr));

        if(Math.abs(indices[0] - indices[1]) <= k){
            return true;
        }
        return false;
    }
    private int[] findingIndices(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 1 ; j < n ; j++){
                if(nums[i] == nums[j]){
                   return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
    }


    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
        int k = 1;
        ContainsNearbyDuplicate ob = new ContainsNearbyDuplicate();
        boolean result = ob.containsNearbyDuplicate(arr, k);
        System.out.println(result);
    }
}
