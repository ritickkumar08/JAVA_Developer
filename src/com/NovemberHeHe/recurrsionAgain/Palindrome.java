package com.NovemberHeHe.recurrsionAgain;

public class Palindrome {
    public static void main(String[] args) {
        int n = 13231;
        Palindrome ob = new Palindrome();
//        int reverse = ob.reverse(n,0)
        boolean result = ob.palindrome(n);
        System.out.println(result);
    }

    private int reverse(int n, int reversed) {
        if(n == 0){
            return reversed;
        }
        return reverse(n / 10, (reversed * 10) + (n % 10));
    }

    private boolean palindrome(int n) {
        return n == reverse(n,0);
    }
}
