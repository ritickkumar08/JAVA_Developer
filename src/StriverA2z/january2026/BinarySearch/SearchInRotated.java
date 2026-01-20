package StriverA2z.january2026.BinarySearch;

class SearchInRotated {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 3;
        SearchInRotated ob = new SearchInRotated();
        int index = ob.search(nums,target);
        System.out.println(index);
    }
    int search(int[] arr, int key) {
        // code here
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == key) return mid;

            if(key < arr[mid] && key <arr[start]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}