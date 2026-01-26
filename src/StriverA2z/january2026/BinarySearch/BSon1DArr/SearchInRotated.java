package StriverA2z.january2026.BinarySearch.BSon1DArr;

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

            if (arr[start] <= arr[mid]){
                if (arr[start] <= key && arr[mid] > key){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if(arr[mid] < key && arr[end] >= key){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}