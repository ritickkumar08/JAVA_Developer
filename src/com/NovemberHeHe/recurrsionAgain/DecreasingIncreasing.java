package com.NovemberHeHe.recurrsionAgain;

public class DecreasingIncreasing {
    public static void main(String[] args) {
        DecreasingIncreasing ob = new DecreasingIncreasing();
        int n = 5;
        ob.printDecreasingIncreasing(n);
    }

    public void printDecreasingIncreasing(int n) {
        if(n == 0){
            return ;
        }

        System.out.print(n + " ");
        printDecreasingIncreasing(n-1);
        System.out.print("\n" + n + " ");
    }
}
