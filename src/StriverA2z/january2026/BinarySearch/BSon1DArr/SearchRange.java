package StriverA2z.january2026.BinarySearch.BSon1DArr;

import java.util.Arrays;

class SearchRange {
    public static void main(String[] args) {
        int[] nums = {1,2,3,8,8,8,8,9};
        int target = 8;
        SearchRange ob = new SearchRange();
        int[] range = ob.searchRange(nums,target);
        System.out.println(Arrays.toString(range));
    }
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                int stPosition = mid;
                int endPosition = mid;
                while (stPosition > 0 && nums[stPosition] == nums[stPosition -1]){
                    stPosition--;
                }
                while (endPosition < nums.length-1 && nums[endPosition] == nums[endPosition+1]){
                    endPosition++;
                }
                return new int[] {stPosition, endPosition};
            }
            else if (nums[mid] > target){
                end = mid -1;
            }else {
                start = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}