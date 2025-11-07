package com.NovemberHeHe.recurrsionAgain;

public class PrintIncreasing {
    public static void main(String[] args) {
        int n = 5;
        PrintIncreasing ob = new PrintIncreasing();
        ob.printIncreasing(n);
    }

    private void printIncreasing(int n) {
        if(n == 0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

}
