package com.SeptemberArrived;

public class CapacityToShip {
    private boolean canBeLoaded(int[] weights, int d , int k){
        int sum = 0; //it is to store the sum of weights
        int days = 1; //we will be increasing the days as we exceed the capacity and we need a minimum of 1 day atleast.
        for(int weight : weights){
            //here we check if the sum of the weights is greater than that of the capacity if yes we send it for the
            //next package.
            if(sum + weight > k){
                sum = weight;
                days ++;
            }else{
                sum += weight; //we keep adding the weights of packages till it satisfies the above condition.
            }
        }
        return days <= d; //if the days taken is less or equal to the given days we return true.
        //we don't need to worry about a day which is lesser than the actual day because we will be checking the condition
        //where the min is greater than that of the max so it will be the maximum of minimum
    }
    public int shipWithinDays(int[] weights, int days) {
        int min = 1;
        int maxi = 0;
        int ans = maxi;

        for(int weight : weights){
            min = Math.max(min,weight); //we want to keep the maximum weight to be the minimum capacity of the ship
            maxi += weight; //the maximum capacity will be the sum of all the weights incase the no of days is one.
        }

        while(min <= maxi){
            int mid = min + (maxi - min) / 2;
            if(canBeLoaded(weights,days,mid)){
                ans = mid;
                maxi = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        CapacityToShip ob = new CapacityToShip();
        int shipCapacity = ob.shipWithinDays(arr,days);
        System.out.println(shipCapacity);
    }
}
