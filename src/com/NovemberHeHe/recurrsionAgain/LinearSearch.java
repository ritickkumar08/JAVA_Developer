package com.NovemberHeHe.recurrsionAgain;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,5,6,8,65,4,3,22,34,56,7,654,32,34,567,654,3};
        int target = 5;
        LinearSearch ob = new LinearSearch();
        System.out.println(ob.linearSearch(arr,target,0));
    }

    private int linearSearch(int[] arr, int target, int i) {
        if(i == arr.length-1){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }
        return linearSearch(arr, target, i+1);
    }
}
