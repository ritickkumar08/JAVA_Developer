package com.SeptemberArrived;

public class KokoEatingBananas {
    private boolean canFinish(int[] piles, int h , int k){
        long hours = 0;
        for(int pile : piles){
            hours += pile / k;
            if(pile % k != 0) hours++;
        }
        return hours <= h;
    }
    private int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int maxi = 1;
        int ans = maxi;

        //we know that koko can eat bananas somewhere in between 1 and the maximum bananas a single pile may have
        //so to search the maximum pile we go through the array and get it.
        for(int i : piles){
            maxi = Math.max(maxi,i);
        }

        while(min <= maxi){
            //trying to get the maximum of the minimum bananas koko should eat to be on time by eating slowly and being fast enough
            // at the same time.
            int mid = min + (maxi - min)/2;
            //if koko can finish the total piles of banana in the given value of k we try to find if we can lower the number of
            //bananas in an hour to be eaten.and as the min is greater than the max element we break out of the loop
            //if she can finish at a mid we try to find even the lower number of bananas
            if(canFinish(piles,h,mid)){
                ans = mid;
                maxi = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 5;

        KokoEatingBananas ob = new KokoEatingBananas();
        int minBananas = ob.minEatingSpeed(arr,h);
        System.out.println(minBananas);
    }
}
