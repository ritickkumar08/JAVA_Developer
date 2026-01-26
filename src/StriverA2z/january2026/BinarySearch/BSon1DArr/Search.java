package StriverA2z.january2026.BinarySearch.BSon1DArr;

class Search {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,8,9,10};
        int target = 11;
        Search ob = new Search();
        int index = ob.search(nums, target);
        System.out.println(index);
    }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return mid;

            if(nums[mid] < target){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return -1;
    }
}