package StriverA2z.january2026.BinarySearch;

class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,6};
        int target = 0;
        SearchInsert ob = new SearchInsert();
        int index = ob.searchInsert(nums,target);
        System.out.println(index);
    }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return mid;

            if(nums[mid] >= target){
                ans = mid;
                end = mid - 1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
}