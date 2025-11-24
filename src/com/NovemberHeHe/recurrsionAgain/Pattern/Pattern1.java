package com.NovemberHeHe.recurrsionAgain.Pattern;


public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        Pattern1 ob = new Pattern1();
        ob.printPattern(n);
        ob.printPattern1(5,0);
        ob.printPattern2(5,0);
    }

    private void printPattern(int n) {
        if(n == 0){
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        printPattern(n-1);
    }

    private void printPattern1(int row, int column) {
        if(row == 0){
            return;
        }

        if(column < row){
            System.out.print("*" + " ");
            printPattern1(row,column+1);
        }else {
            System.out.println();
            printPattern1(row-1,0);
        }
    }

    private void printPattern2(int row, int column) {
        if(row == 0){
            return;
        }

        if(column < row){
            printPattern2(row,column+1);
            System.out.print("*" + " ");
        }else {
            printPattern2(row-1,0);
            System.out.println();
        }
    }
}
