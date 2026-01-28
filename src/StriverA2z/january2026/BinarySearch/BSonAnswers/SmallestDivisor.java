package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.Arrays;

class SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        SmallestDivisor ob = new SmallestDivisor();
        int smallest = ob.smallestDivisor(nums,threshold);
        System.out.println(smallest);
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Arrays.stream(nums).max().getAsInt();

        int low = 1;
        int high = max;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(sum(nums, mid) <= threshold){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return low;
    }

    private int sum(int[] nums,int div) {
        int total = 0;
        for (int num : nums){
            total += Math.ceil((double)num/div);
        }
        return total;
    }
}