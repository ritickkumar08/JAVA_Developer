package StriverA2z.january2026.BinarySearch;

class FindKRotation {
    public static void main(String[] args) {
        int[] nums = {3,4,5, 1, 2};
        FindKRotation ob = new FindKRotation();
        int rotations = ob.findKRotation(nums);
        System.out.println(rotations);
    }
    public int findKRotation(int arr[]) {
        // Code here
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }

        return start;
    }
}