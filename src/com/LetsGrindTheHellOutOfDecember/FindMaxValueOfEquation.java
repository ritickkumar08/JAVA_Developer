package com.LetsGrindTheHellOutOfDecember;

//You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values, 
//where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length. 
//You are also given an integer k.
//
//Return the maximum value of the equation yi + yj + |xi - xj|
//where |xi - xj| <= k and 1 <= i < j <= points.length.
//
//It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.
//Example 1:
//
//Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
//Output: 4
//Explanation: The first two points satisfy the condition |xi - xj| <= 1 and 
//if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy 
//the condition and give a value of 10 + -10 + |5 - 6| = 1.
//No other pairs satisfy the condition, so we return the max of 4 and 1.


class FindMaxValueOfEquation {
    public static void main(String[] args) {
        int[][] points = {{-9,-12},{-3,-18},{12,18},{11,-8},{-8,2},{-7,12},{-5,16},{-3,9},{1,-7},{5,-4},{6,-20},{10,4},{16,4},{19,-9},{20,19}};
        int k = 6;
        FindMaxValueOfEquation ob = new FindMaxValueOfEquation();
        int value = ob.findMaxValueOfEquation(points,k);
        System.out.println(value);
    }
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (points[j][0] - points[i][0] <= k ){
                    int value = points[i][1] + points[j][1] + (points[j][0] - points[i][0]);
                    max = Math.max(max,value);
                }
            }
        }

        return max;
    }
}