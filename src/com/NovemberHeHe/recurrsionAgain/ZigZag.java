package com.NovemberHeHe.recurrsionAgain;

public class ZigZag {
    public static void main(String[] args) {
        int n = 2;
        ZigZag ob = new ZigZag();
        ob.zigZag(n);
    }

    private void zigZag(int n) {
        if(n == 0){
            return;
        }
        System.out.println("pre" + n);
        zigZag(n-1);
        System.out.println("In" + n);
        zigZag(n-1);
        System.out.println("post" + n);
    }
}
