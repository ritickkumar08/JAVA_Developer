package com.August;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candies_23 {
    private List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> list = new ArrayList<>();

        int greatest = 0;
        for(int i = 0 ; i < candies.length ; i++){
            if(greatest < candies[i]){
                greatest = candies[i];
            }
        }

        for(int candy : candies ){
            if(candy + extraCandies >= greatest){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of children" + " ");
        int n = sc.nextInt();
        int[] candies = new int[n];
        for(int i = 0 ; i < n ; i++){
            candies[i] = sc.nextInt();
        }
        System.out.println("number of candies" + " ");
        int extra = sc.nextInt();

        Candies_23 ob = new Candies_23();
        List<Boolean> result = ob.kidsWithCandies(candies,extra);
        System.out.println(result);
    }
}
