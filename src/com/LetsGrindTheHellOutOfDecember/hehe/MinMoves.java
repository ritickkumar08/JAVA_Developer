package com.LetsGrindTheHellOutOfDecember.hehe;

import java.util.ArrayList;
import java.util.Arrays;

class MinMoves {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,4));
        MinMoves ob = new MinMoves();
        int count = ob.minMoves(list);
        System.out.println(count);
    }
    // Function to find the minimum number of moves required.
    public int minMoves(ArrayList<Integer> arr) {
        // code here.
        int count = 0;
        for(int i = 0 ; i < arr.size() - 1 ; i++){
            if(arr.get(i) > arr.get(i+1)){
               continue;
            }
            count++;
        }
        return count;
    }
}