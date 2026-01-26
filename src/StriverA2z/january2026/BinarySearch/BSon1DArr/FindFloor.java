package StriverA2z.january2026.BinarySearch.BSon1DArr;

class FindFloor {
    public static void main(String[] args) {
        int[] nums = {2};
        int x = 6;
        FindFloor ob = new FindFloor();
        int floor = ob.findFloor(nums,x);
        System.out.println(floor);
    }
    public int findFloor(int[] arr, int x) {
        // code here
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(x >= arr[mid]){
                start = mid +1;
                while(mid < arr.length-1 && arr[mid] == arr[mid+1]){
                    mid++;
                }
                ans = mid;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
}
