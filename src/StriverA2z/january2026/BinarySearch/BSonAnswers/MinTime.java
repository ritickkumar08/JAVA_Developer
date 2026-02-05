package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.Arrays;

class MinTime {
    public static void main(String[] args) {
        int[] nums = {10,5,30,20,15};
        int k = 3;
        MinTime ob = new MinTime();
        int time = ob.minTime(nums, k);
        System.out.println(time);
    }
    public int minTime(int[] arr, int k) {
        // code here
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low <= high){
            int mid = low + (high - low)/2;
            int painters = countPainters(arr, mid);

            if(painters > k){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return low;
    }

    private int countPainters(int[] arr, int units) {
        int painters = 1;
        int currentLength = 0;

        for (int length : arr){
            if(currentLength + length <= units){
                currentLength += length;
            }else {
                painters++;
                currentLength = length;
            }
        }
        return painters;
    }
}
