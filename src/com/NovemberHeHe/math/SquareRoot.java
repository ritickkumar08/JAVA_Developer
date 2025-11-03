package com.NovemberHeHe.math;

public class SquareRoot {
    public double viaBinarySearch(int n , int p ){
        int start = 2 ;
        int end = n;

        double root = 0.0;
        while(start <= end){
            int mid = start + ( end - start)/2;
            if(mid * mid == n) return mid;
            else if (mid * mid > n) end = mid -1;
            else  start = mid + 1;
        }

        double increment = 0.1;
        for(int i = 0 ; i < p ; i++){
            while(root * root <= n){
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }

    public static void main(String[] args) {
        SquareRoot ob = new SquareRoot();
        int n = 40;
        int p = 3;
        double root = ob.viaBinarySearch(n,p);
        System.out.println(root);
    }
}
