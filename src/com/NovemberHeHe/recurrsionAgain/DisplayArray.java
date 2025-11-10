package com.NovemberHeHe.recurrsionAgain;

public class DisplayArray {
    public static void main(String[] args) {
        DisplayArray ob = new DisplayArray();
        int arr[] = {10, 20, 30, 40, 50, 60};
        int n = 6;
        ob.displayArray(arr, 0);
    }

    private void displayArray(int[] arr, int i) {
        if(i == arr.length){
            return;
        }

        System.out.println(arr[i]);
        displayArray(arr, i+1);
    }
}
