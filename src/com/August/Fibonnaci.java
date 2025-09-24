package com.August;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int last = 0;
        int present = 1;
        int sum = last + present;

        int i = 0;
        while( i < n){
          int next = last + present;
          sum +=  next ;
          last = present;
          present = next;
          System.out.println(next);
          i++;
        }
        System.out.println(sum);

    }
}
