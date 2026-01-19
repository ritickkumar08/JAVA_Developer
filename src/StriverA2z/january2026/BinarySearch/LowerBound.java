package StriverA2z.january2026.BinarySearch;

class LowerBound {
    public static void main(String[] args) {
        int[] nums = {2,3,7,10,10,11};
        int k = 9;
        LowerBound ob = new LowerBound();
        int index = ob.lowerBound(nums,k);
        System.out.println(index);
    }
    int lowerBound(int[] arr, int target) {
        // code here
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while (start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] >= target){
                 ans = mid;
                 end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
}