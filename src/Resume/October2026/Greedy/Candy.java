package Resume.October2026.Greedy;

import java.util.Arrays;

class Candy {
    public static void main(String[] args) {
        int[] ratings = {1,2,2};

        Candy ob = new Candy();
        int ans = ob.candy(ratings);
        System.out.println(ans);
    }
    public int candy1(int[] ratings) {
        if (ratings == null || ratings.length == 0){
            return 0;
        }
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int candies = 1;
        left[0] = candies;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1]){
                candies++;
            }else {
                candies = 1;
            }
            left[i] = candies;
        }
        System.out.println(Arrays.toString(left));
        candies = 1;
        right[n-1] = candies;
        for (int i = n-2; i >=0 ; i--) {
            if (ratings[i] > ratings[i+1]){
                candies++;
            }else {
                candies = 1;
            }
            right[i] = candies;
        }
        System.out.println(Arrays.toString(right));

        int totalCandies = 0;
        for (int i = 0; i < n; i++) {
            totalCandies += Math.max(left[i],right[i]);
        }

        return totalCandies;
    }

    public int candy2(int[] ratings) {
        if (ratings == null || ratings.length == 0){
            return 0;
        }
        int n = ratings.length;
        int[] left = new int[n];

        int candies = 1;
        left[0] = candies;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1]){
                candies++;
            }else {
                candies = 1;
            }
            left[i] = candies;
        }

        int totalCandies = Math.max(1, left[n-1]);
        candies = 1;
         for (int i = n-2; i >=0 ; i--) {
            if (ratings[i] > ratings[i+1]){
                candies += 1;
            }else {
                candies = 1;
            }

            totalCandies += Math.max(candies, left[i]);
        }

        return totalCandies;
    }

    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0){
            return 0;
        }
        int n = ratings.length;
        int i = 1;
        int totalCandies = n;

        while (i < n){
            if (ratings[i] == ratings[i-1]){
                i++;
                continue;
            }

            int peak = 0;
            while (i < n && ratings[i] > ratings[i-1]){
                peak++;
                totalCandies += peak;
                i++;
            }

            int down = 0;
            while (i < n && ratings[i] < ratings[i-1]){
                down++;
                totalCandies += down;
                i++;
            }

            totalCandies -= Math.min(peak, down);
        }
        return totalCandies;
    }
}