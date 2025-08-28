package com.First_program;
import java.util.*;

public class ArraysExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        System.out.println(Arrays.compare(a, b)); // < 0 because a < b

        byte[] x = {(byte) 200};
        byte[] y = {(byte) 100};
        System.out.println(Arrays.compareUnsigned(x, y)); // > 0 since 200 > 100
    }
}
