package May2026.Subarray;

class LongestOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        LongestOnes ob = new LongestOnes();
        int ans = ob.longestOnes(nums, k);
        System.out.println(ans);
    }
    public int longestOnes(int[] nums, int k) {
        int longest = 0;
        // Left pointer of the sliding window
        int left = 0;
        int zeros = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0){
                zeros++;
            }

            // If zeros exceeds k, move left and adjust zerocount
            if (zeros > k){
                if (nums[left] == 0){
                    zeros--;
                }
                left++;
            }

            longest = Math.max(longest, right-left+1);
        }

        return longest;
    }
}