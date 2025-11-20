package com.NovemberHeHe.recurrsionAgain;

public class CountZeros {
    public static void main(String[] args) {
        CountZeros ob = new CountZeros();
        int n = 102030300;
        int count = ob.countZero(n,0);
        System.out.println(count);
    }

    private int countZero(int n, int count) {
        if(n == 0 ){
            return count;
        }
        int digit = n % 10;
        if(digit == 0){
            return countZero(n/10,count + 1);
        }else {
            return countZero(n/10 , count);
        }
    }
}
