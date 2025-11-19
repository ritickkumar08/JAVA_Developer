package com.NovemberHeHe.recurrsionAgain;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 54321;
        ReverseANumber ob = new ReverseANumber();
        int reversed = ob.reverseANumber(n,0);
        System.out.println(reversed);
    }

    private int reverseANumber(int n,int reversed) {
        if(n == 0){
            return reversed;
        }
        return reverseANumber(n / 10, (reversed * 10) + (n % 10));
//        int reversed = 0;
//        while(n > 0){
//            int digit = n % 10;
//            reversed = (reversed * 10) +  digit;
//            n = n/10;
//        }
//        return reversed;
    }
}
