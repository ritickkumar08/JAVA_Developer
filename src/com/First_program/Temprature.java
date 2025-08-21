package com.First_program;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree of temprature");
        float degree = sc.nextFloat();

        float feranhite = (degree * 9/5) + 32;
        System.out.println(feranhite);

    }
}
