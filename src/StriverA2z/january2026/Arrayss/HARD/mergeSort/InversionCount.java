package StriverA2z.january2026.Arrayss.HARD.mergeSort;

class InversionCount {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 3, 5};
//        InversionCount ob = new InversionCount();
        int count = inversionCount(nums);
        System.out.println(count);
    }
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr, 0, arr.length-1);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if(low >= high) return count;
        int mid = (low + high) / 2;

        // Count inversions in low half
        count += mergeSort(arr,low, mid);
        // Count inversions in high half
        count += mergeSort(arr, mid+1, high);
        // Count inversions during merge
        count += merge(arr, low, mid, high);

        return count;
    }

    // Function to merge two halves and count inversions
    private static int merge(int[] arr, int low, int mid, int high) {
        // Temporary array
        int[] temp = new int[high-low + 1];

        // Starting indices of left and right halves
        int left = low;
        int right = mid + 1;
        int k = 0;

        // Variable to count inversions
        int cnt = 0;

        // Merge elements in sorted order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
                cnt += (mid - left + 1); // Count inversions
            }
        }

        // Copy remaining elements of left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements of right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return cnt;

    }
}