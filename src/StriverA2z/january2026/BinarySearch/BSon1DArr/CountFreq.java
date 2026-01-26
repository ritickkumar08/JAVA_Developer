package StriverA2z.january2026.BinarySearch.BSon1DArr;

class CountFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,8,9};
        int target = 8;
        CountFreq ob = new CountFreq();
        int count = ob.countFreq(nums,target);
        System.out.println(count);
    }
    int countFreq(int[] arr, int target) {
        // code here
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                int stPosition = mid;
                int endPosition = mid;
                while (stPosition > 0 && target == arr[stPosition -1]){
                    stPosition--;
                }
                while (endPosition < arr.length-1 && target == arr[endPosition+1]){
                    endPosition++;
                }
               return  (endPosition-stPosition) +1;
            }
            else if (arr[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}