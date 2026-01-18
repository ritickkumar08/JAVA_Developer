package StriverA2z.january2026.Arrayss.HARD.SubArrays;

class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        MaxProduct ob = new MaxProduct();
        int product = ob.maxProduct(nums);
        System.out.println(product);
    }
    public int maxProduct(int[] nums) {
        int maxProduct = 1;
        for (int j = 0; j < nums.length; j++) {
            int product = 1;
            for (int i = j; i < nums.length; i++) {
                product *= nums[i];

                maxProduct = Math.max(maxProduct,product);
            }
        }
        return maxProduct;
    }
}