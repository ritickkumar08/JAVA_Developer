package com.weAreNowInOctober.conatinsNearBy;

public class ContainsNearbyDuplicate2 {
    public boolean containsNearbyDuplicate(int[] arr,  int k) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j =  i + 1 ; j < n ; j++){
                if(arr[i] == arr[j]){
                    if(Math.abs(i - j) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 1;
        ContainsNearbyDuplicate2 ob = new ContainsNearbyDuplicate2();
        boolean result = ob.containsNearbyDuplicate(arr, k );
        System.out.println(result);
    }
}
