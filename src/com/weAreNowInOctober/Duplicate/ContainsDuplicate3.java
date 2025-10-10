package com.weAreNowInOctober.Duplicate;

import java.util.Arrays;

public class ContainsDuplicate3 {
    public boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        if(n <= 1){
            return false;
        }
        Arrays.sort(arr);

        for(int j = 0 ; j < n - 1 ; j++){
            if(arr[j] == arr[j+1]){//here as the array is sorted so the same value will be next to each other and
                //wherever we find that the next element value is same we return true then and there.
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {};
        ContainsDuplicate3 ob = new ContainsDuplicate3();
        boolean result = ob.containsDuplicate(arr);
        System.out.println(result);
    }
}
