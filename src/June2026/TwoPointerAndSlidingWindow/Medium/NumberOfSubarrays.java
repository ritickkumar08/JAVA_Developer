package June2026.TwoPointerAndSlidingWindow.Medium;

import java.util.HashMap;

class NumberOfSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;

        NumberOfSubarrays ob = new NumberOfSubarrays();
        int ans = ob.numberOfSubarrays(nums, k);
        System.out.println(ans);
    }
    public int numberOfSubarrays1(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int odds = 0;
            for (int j = i; j < nums.length; j++) {
                if ((nums[j] & 1) != 0){
                    odds++;
                }
                if (odds == k){
                    count++;
                }
                if (odds > k) {
                    break;
                }
            }
        }
        return count;
    }
    //let's try to better the approach with two pointers and sliding window method.
    public int numberOfSubarrays2(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }

    private int atMost(int[] nums, int k) {
            if(k < 0) return 0;

            int count = 0;
            int left = 0;
            int right = 0;
            int oddCount = 0;

            while (right < nums.length){
                if ((nums[right] & 1) != 0){
                    oddCount++;
                }

                while (oddCount > k){  // shrink until valid, we will be shrinking the window till we have odd numbers
                    //pointed by the left pointer.
                    if ((nums[left] & 1) != 0){
                        oddCount--; //if the number is odd the count of the odd numbers is also to be decreased.
                    }
                    left++;//and if not then the left pointer will be moved forward.
                }

                count += (right-left+1); //as the subarrays till the right pointer will have that so we do this.

                right++;
            }
            return count;
    }

    //we can better the time complexity using the hashmap and the prefix sum technique
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>(); //map to contain the prefix number of odd numbers.

        freq.put(0,1);  // Initial state: zero odd numbers has occurred once

        // Running count of odd numbers in current prefix
        int oddCount = 0;

        // Total number of nice subarrays
        int result = 0;

        //let's traverse the array
        for (int num : nums){
            if ((num & 1) != 0) oddCount++;

            if (freq.containsKey(oddCount - k)){
                result += freq.get(oddCount -k);
            }

            freq.put(oddCount, freq.getOrDefault(oddCount,0)+1);
        }

        return result;
    }
}