package StriverA2z.january2026.Arrayss.HARD.SubArrays;

public class MaxProduct2 {
    public static void main(String[] args) {
        int[] nums = {-3,10,-6,12,-1};
        MaxProduct2 ob = new MaxProduct2();
        int product = ob.maxProduct(nums);
        System.out.println(product);
    }
    public int maxProduct(int[] nums) {
        int ans =  nums[0];
        int minProduct = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentProduct = nums[i];

            if(currentProduct < 0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(currentProduct, maxProduct * currentProduct);
            minProduct = Math.min(currentProduct, minProduct * currentProduct);

            ans= Math.max(ans, maxProduct);
        }
        return ans;
    }
}
