package StriverA2z.january2026.Arrayss.MEDIUM;

class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        MaxSubArray ob = new MaxSubArray();
        int sum = ob.maxSubArray(nums);
        System.out.println(sum);
    }
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int i = 1;
        int n = nums.length;

        while(i < n){
            if(currentSum < 0){
                currentSum = nums[i];
            }else{
                currentSum += nums[i];
            } i++;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}