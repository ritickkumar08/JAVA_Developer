package April2026.Restart;

class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        MaxSubArray ob = new MaxSubArray();
        int sum = ob.maxSubArray(arr);
        System.out.println(sum);
    }
    public int maxSubArray1(int[] nums) {
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
               int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    public int maxSubArray2(int[] nums) {
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(sum < 0){
                sum = nums[i];
            }else {
                sum += nums[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}