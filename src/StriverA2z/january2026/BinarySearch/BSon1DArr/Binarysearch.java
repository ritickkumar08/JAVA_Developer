package StriverA2z.january2026.BinarySearch.BSon1DArr;

class Binarysearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 4;
        Binarysearch ob = new Binarysearch();
        int index = ob.binarysearch(nums,k);
        System.out.println(index);
    }
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start = 0;
        int end = arr.length;

        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] == k){
                while(mid > 0 && arr[mid-1] == k){
                    mid--;
                }
                return mid;
            }
            if(arr[mid] < k){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return -1;
    }
}