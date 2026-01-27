package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.Arrays;

class MinDays {
    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        MinDays ob = new MinDays();
        int days = ob.minDays(bloomDay, m, k);
        System.out.println(days);
    }
    public int minDays(int[] bloomDays, int m, int k) {
        long need = (long)k * m;
        int n = bloomDays.length;
        if(need > n){
            return -1;
        }

        //finding the minimum day and maximum day to bloom flowers
        int mini = Arrays.stream(bloomDays).min().getAsInt();
        int maxi = Arrays.stream(bloomDays).max().getAsInt();

        int start = mini, end = maxi, minDay =-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isPossible(bloomDays,mid,m,k)){
                minDay = mid;
                end = mid -1;
            }else {
                start = mid+1;
            }
        }

        return minDay;
    }

    private boolean isPossible(int[] bloomDays, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;

        for(int bloom : bloomDays){
            if(bloom <= day){
                count++;
                if(count == k){
                    bouquets++;
                    count = 0;
                }
            }else {
                count = 0;
            }
        }
        return bouquets >= m;
    }
}