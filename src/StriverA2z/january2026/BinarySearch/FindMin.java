package StriverA2z.january2026.BinarySearch;

class FindMin {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        FindMin ob = new FindMin();
        int mini = ob.findMin(nums);
        System.out.println(mini);
    }
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start +(end-start)/2;

            if(nums[mid] > nums[end]){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return nums[start];
    }
}