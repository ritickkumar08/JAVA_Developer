package StriverA2z.january2026.Arrayss.HARD.mergeSort;

import java.util.ArrayList;

public class ReversePairs1 {
    public static void main(String[] args) {
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        ReversePairs1 ob = new ReversePairs1();
        int pairs = ob.reversePairs(nums);
        System.out.println(pairs);
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    private int mergeSort(int[] nums, int low, int high) {
        int count = 0;
        if(low >= high) return count;
        int mid = (low + high)/2;

        count += mergeSort(nums, low, mid); // left half
        count += mergeSort(nums, mid+1, high); // right half
        count += countPairs(nums,low,mid,high); //Modification
        merge(nums, low, mid, high); // merging sorted halves

        return count;
    }

    private void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>(); // temporary array
        int left = low; // starting index of left half of arr
        int right = mid+1;  // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//
        while (left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                list.add(nums[left++]);
            }else {
                list.add(nums[right++]);
            }
        }
        // if elements on the left half are still left //
        while (left <= mid){
            list.add(nums[left++]);
        }
        //  if elements on the right half are still left //
        while (right <= high){
            list.add(nums[right++]);
        }
        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            nums[i] = list.get(i - low);
        }
    }

    private int countPairs(int[] nums, int low, int mid, int high) {
        int right = mid+1;
        int count = 0;

        for (int i = low; i <= mid; i++) {
            while(right <= high && nums[i] > (2L*nums[right])) right++;
            count += (right - (mid+1));
        }
        return count;
    }
}
