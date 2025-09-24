package com.August;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int pro = n*m;

        while(m != 0){
            int temp = m;
            m = n % m;
            n = temp;
        }
        System.out.println(n);

        int lcm = pro /n;
        System.out.println(lcm);
    }
}
