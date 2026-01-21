package StriverA2z.january2026.BinarySearch;

class SearchInRotated2 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 0;
        SearchInRotated2 ob = new SearchInRotated2();
        boolean exists = ob.search(nums,target);
        System.out.println(exists);
    }
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target) return true;

            // Handle duplicates: cannot determine sorted side
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }

            //first half is sorted starting from the start to mid elements
            if(nums[start] <= nums[mid]){
                //checking if the target element exists within the first half of the array.
                if(nums[start] <= target && nums[mid] > target){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if(nums[mid] < target && nums[end] >= target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return false;
    }
}