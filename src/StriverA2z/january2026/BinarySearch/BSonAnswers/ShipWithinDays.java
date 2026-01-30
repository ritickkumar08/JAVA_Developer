package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.Arrays;

class ShipWithinDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        ShipWithinDays ob = new ShipWithinDays();
        int shipCapacity = ob.shipWithinDays(weights, days);
        System.out.println(shipCapacity);
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = 0;
        for(int weight : weights){
            high += weight;
        }

        while(low < high){
            int mid = low + (high - low)/2;

            int needed = (daysNeeded(weights,mid));

            if(needed <= days){
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return low;
    }

    private int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentWeight = 0;

        for (int weight : weights){
            if(currentWeight + weight > capacity){
                days++;
                currentWeight = weight;
            }else {
                currentWeight += weight;
            }
        }
        return days;
    }
}