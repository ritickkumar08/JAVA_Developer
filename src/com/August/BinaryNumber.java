package com.August;

public class BinaryNumber {
    public static void main(String[] args) {
//        int n = 5;
//
//        int y = n << 1;
//        System.out.println(y);
//        String binary = " ";

//        while(n != 0){
//            if(n % 2 == 0) binary += '0';
//            else binary+= '1';
//            n /= 2;
//        }
//

//        System.out.println(binary);

        int n = 5;
        int k = 0;
        while((1 << k) - 1 < n){
            System.out.println(k);
                    k++;
            System.out.println(k);
        }
        System.out.println( (1 << k) - 1);

    }
}
