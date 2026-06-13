package June2026.TwoPointerAndSlidingWindow.Medium;

class NumSubarraysWithSum {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        int goal = 0;

        NumSubarraysWithSum ob = new NumSubarraysWithSum();
        int ans = ob.numSubarraysWithSum(nums, goal);
        System.out.println(ans);
    }
    public int numSubarraysWithSum1(int[] nums, int goal) {
        int subArrays = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal){
                    subArrays++;
                }
            }
        }
        return subArrays;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }

    private int atMost(int[] nums, int goal) {
        // No valid subarray for negative sum
        if (goal < 0) return 0;

        int subArrays = 0; //the variable which will be storing the count of the subarrays.
        int left = 0; //hte pointer to the start of the window.
        int right = 0; //hte pointer for the end of the window.
        int sum = 0; //the vaiable to store the sum till the current element.
        while (right < nums.length){
            sum += nums[right];

            //a required subarray.
            while (sum > goal){
                sum -= nums[left];
                left++;
            }
            //this will happen for every sum less than or equal to the given goal
            subArrays += (right-left+1);//if the sum till the current element is equal to goal then we have
            right++;
        }

        return subArrays;
    }
}