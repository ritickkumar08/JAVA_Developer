package com.First_program;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle amount");
        int p = sc.nextInt();
        System.out.println("enter the rate of interest");
        double r = sc.nextDouble();
        System.out.println("enter the time");
        double t =sc.nextDouble();

        double interest = (p*r*t)/100;
        System.out.println("the interest earned is" + " " + interest);
    }
}
