package StriverA2z.january2026.Arrayss.HARD.SubArrays;

public class MaxProduct1 {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        MaxProduct1 ob = new MaxProduct1();
        int product = ob.maxProduct(nums);
        System.out.println(product);
    }
    public int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1;

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(prefix == 0) prefix =1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];

            suffix *= nums[nums.length - i - 1];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}
