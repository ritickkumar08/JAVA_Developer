package com.weAreNowInOctober.BitManipulation;

import java.util.Arrays;

class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int[][] result = new int[n][m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++) {
                result[i][j] = image[i][m - j - 1] ^ 1; //first reversing the array element and then XORing it
                //at the same time so that we can get 1 at 0 and 0 at 1.
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,0},{1,0,1},{0,0,0}};
        FlipAndInvertImage ob = new FlipAndInvertImage();
        int[][] result = ob.flipAndInvertImage(matrix);
        System.out.println(Arrays.deepToString(result));
    }
}