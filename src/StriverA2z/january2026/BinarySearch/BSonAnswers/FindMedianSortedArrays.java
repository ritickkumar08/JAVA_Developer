package StriverA2z.january2026.BinarySearch.BSonAnswers;

class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        FindMedianSortedArrays ob = new FindMedianSortedArrays();
        double median = ob.findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[m+n];
        int k = 0;

        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n){
            merged[k++] = nums1[i++];
        }
        while (j < m){
            merged[k++] = nums2[j++];
        }

        int totalength = merged.length;
        double median = 0.0;
        if(totalength % 2 == 0){
            int first = (totalength/2) - 1;
            int second = (totalength/2);
            median = (merged[first] + merged[second]) / 2.0;
        }else {
            median = merged[totalength/2];
        }

        return median;
    }
}