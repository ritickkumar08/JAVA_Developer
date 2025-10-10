package com.weAreNowInOctober.Duplicate;

public class ContainsDuplicate2 {
    private boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        if(n <= 1){
            return false;
        }
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(arr[j] > arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }

        for(int j = 0 ; j < n - 1 ; j++){
            if(arr[j] == arr[j+1]){
                return true;
            }
        }

        return false;
    }

    private void swap(int[] arr, int first, int second) {
        int temp =  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        ContainsDuplicate2 ob = new ContainsDuplicate2();
        boolean result = ob.containsDuplicate(arr);
        System.out.println(result);
    }
}
