package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.Arrays;

class SplitArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        SplitArray ob = new SplitArray();
        int maxSum = ob.splitArray(nums, k);
        System.out.println(maxSum);
    }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = 0;
        for(int num : nums){
            high += num;
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            int partitions = countPartions(nums, mid);

            if(partitions > k){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return low;
    }

    private int countPartions(int[] nums, int splitSum) {
        int partitions = 1;
        int subarraySum = 0;

        for(int num: nums){
            if(subarraySum + num <= splitSum){
                subarraySum += num;
            }else{
                partitions++;
                subarraySum = num;
            }
        }
        return partitions;
    }
}