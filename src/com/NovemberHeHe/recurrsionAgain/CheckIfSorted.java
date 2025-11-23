package com.NovemberHeHe.recurrsionAgain;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        CheckIfSorted ob = new CheckIfSorted();
        System.out.println(ob.isSorted(arr,1));
    }

    private boolean isSorted(int[] arr, int i) {
        if(i == arr.length-1){
            return true;
        }

        if(arr[i-1] < arr[i]){
            return isSorted(arr,i+1);
        }

        return false;
    }
}
