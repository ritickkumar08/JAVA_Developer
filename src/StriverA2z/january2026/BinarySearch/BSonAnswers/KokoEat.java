package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.Arrays;

class KokoEat {
    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368};
        int k = 1000000000;
        KokoEat ob = new KokoEat();
        int ans = ob.kokoEat(arr, k);
        System.out.println(ans);
    }
    public int kokoEat(int[] arr, int k) {
        // code here
        int maxPile = Arrays.stream(arr).max().getAsInt();
        int low = 1;
        int high = maxPile;
        int ans = maxPile;

        while(low <= high){
            int mid = low + (high - low)/2;
            int totalHr = calculateHours(arr,mid);

            if(totalHr <= k){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }

    private int calculateHours(int[] piles,int speed) {
        int totalHr = 0;
        for (int bananas : piles){
            totalHr += (int) Math.ceil((double)bananas / speed);
        }
        return totalHr;
    }
}
