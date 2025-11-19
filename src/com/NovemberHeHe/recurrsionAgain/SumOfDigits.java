package com.NovemberHeHe.recurrsionAgain;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        SumOfDigits ob = new SumOfDigits();
        int result = ob.sumOfDigits(n);
        System.out.println(result);
    }

    private int sumOfDigits(int n) {
        if(n < 10){
            return n;
        }
      int sum = n % 10 + sumOfDigits(n/10);
      return sum;
    }
}
