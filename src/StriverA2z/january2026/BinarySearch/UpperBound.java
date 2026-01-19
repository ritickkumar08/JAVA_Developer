package StriverA2z.january2026.BinarySearch;

class UpperBound {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 10, 11, 11, 25};
        int target = 28;
        UpperBound ob = new UpperBound();
        int index = ob.upperBound(nums,target);
        System.out.println(index);
    }
    int upperBound(int[] arr, int target) {
        // code here
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                ans = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
}