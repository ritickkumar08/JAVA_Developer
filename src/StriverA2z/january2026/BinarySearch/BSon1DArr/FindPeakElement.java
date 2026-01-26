package StriverA2z.january2026.BinarySearch.BSon1DArr;

class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        FindPeakElement ob = new FindPeakElement();
        int peak = ob.findPeakElement(nums);
        System.out.println(peak);
    }
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(nums[mid] > nums[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
}