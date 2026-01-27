package StriverA2z.january2026.BinarySearch.BSonAnswers;

class FindKthPositiv {
    public static void main(String[] args) {
        int[] nums = {2,3,4,7,11};
        int k = 5;
        FindKthPositiv ob = new FindKthPositiv();
        int i = ob.findKthPositive(nums, k);
        System.out.println(i);
    }
    public int findKthPositive1(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= k){
                k++;
            }else {
                break;
            }
        }
        return k;
    }
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            int missing = arr[mid] - (mid+1);

            if(missing < k){
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
        return k + end + 1;
    }
}