package com.LetsGrindTheHellOutOfDecember.newL.removeDuplicates;

class BruteForce {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        BruteForce ob = new BruteForce();
        int k = ob.removeDuplicates(arr);
//        System.out.println(Arrays.toString(k));
        System.out.println(k);
    }
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        int i = 1;
        int count = 1;

        while(i < n){
            if(nums[i] == nums[i-1]){
                count++;
            }else {
                count = 1;
            }

            //now swapping
            if(count > 2){
                for (int j = i; j < n- 1; j++) {
                    nums[j] = nums[j+1];
                }
                n--;
            }else {
                i++;
            }
        }
        return n;
    }

    private void swap(int[]nums,int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}