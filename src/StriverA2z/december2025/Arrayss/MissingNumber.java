package StriverA2z.december2025.Arrayss;

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        MissingNumber ob = new MissingNumber();
        int number = ob.missingNumber(nums);
        System.out.println(number);
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        int missingSum = 0;
        for (int i = 0; i < n; i++) {
            missingSum += nums[i];
        }

        return totalSum - missingSum;
    }
}