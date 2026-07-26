package July2026.Contests;

class MinimumCost {
    public static void main(String[] args) {
        int[] nums = {1,1,7,14};
        int k = 4;

        MinimumCost ob = new MinimumCost();
        int ans = ob.minimumCost(nums, k);
        System.out.println(ans);
    }
    public int minimumCost(int[] nums, int k) {
        long operations = 0;
        long resources = k;
        long MOD = 1_000_000_007L;


        for (int i = 0; i < nums.length; i++) {
            if (resources < nums[i]){
                long missing = nums[i] - resources;

                long opsneeded = (missing + k - 1) / k;

                operations += opsneeded;
                resources += opsneeded * k;
            }
            resources -= nums[i];
        }

        long totalCost = (operations * (operations + 1)) / 2;
        return (int)(totalCost % MOD);
    }
}