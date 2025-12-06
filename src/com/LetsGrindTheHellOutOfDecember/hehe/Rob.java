package com.LetsGrindTheHellOutOfDecember.hehe;

class Rob {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        Rob ob = new Rob();
        int totalMoney = ob.rob(arr);
        System.out.println(totalMoney);
    }
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for(int money : nums){
            int take = prev2 + money;
            int skip = prev1;
            int current = Math.max(take,skip);

            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}