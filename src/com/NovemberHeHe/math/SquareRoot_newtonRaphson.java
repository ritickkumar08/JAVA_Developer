package com.NovemberHeHe.math;

public class SquareRoot_newtonRaphson {
    private double squareRoot(int n) {
        double root = 0.0;
        double x = n;

        while(true){
            root = 0.5*(x + n/x);

            if(Math.abs(root - x) < 0.0001){
                break;
            }
            x = root;
        }
        return root;
    }


    public static void main(String[] args) {
        int n = 37;
        SquareRoot_newtonRaphson ob = new SquareRoot_newtonRaphson();
        System.out.println(ob.squareRoot(n));
    }
}
