package StriverA2z.december2025.Arrayss;

class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,0,0,0,0,0,0};
        FindMaxConsecutiveOnes ob = new FindMaxConsecutiveOnes();
        int ones = ob.findMaxConsecutiveOnes(nums);
        System.out.println(ones);
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int MaxOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                MaxOnes = Math.max(count,MaxOnes);
            }else {
                count = 0;
            }
        }
        return MaxOnes;
    }
}