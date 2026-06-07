package June2026.TwoPointerAndSlidingWindow;

class LongestOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        LongestOnes ob = new LongestOnes();
        int ans =  ob.longestOnes(nums, k);
        System.out.println(ans);
    }
    public int longestOnes1(int[] nums, int k) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int limit = k;
            int len = 0;
            for (int j = i; j < nums.length && limit > 0; j++) {
                if (nums[j] == 0){
                    limit--;
                }
                len += 1;
            }
            maxLength = Math.max(len, maxLength);
        }
        return maxLength;
    }
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int zeros = 0;

        while (right < nums.length){
            int length;
            if (nums[right] == 0){
                zeros++;
            }

            if (zeros > k){
                if (nums[left] == 0){
                    zeros--;
                }
                left++;
            }

            length = right - left + 1;
            maxLength = Math.max(length, maxLength);
            right++;
        }

        return maxLength;
    }
}
