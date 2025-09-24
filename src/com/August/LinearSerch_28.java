package com.August;

import java.util.Scanner;

public class LinearSerch_28 {
    private boolean search(int[] arr, int target){
        for(int num : arr){
            if(num == target)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of the array" + " ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elments");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the target number");
        int target = sc.nextInt();

        LinearSerch_28 ob = new LinearSerch_28();
        boolean answer = ob.search(arr , target);
        System.out.println(answer);

        sc.close();
    }
}
