package StriverA2z.december2025.Arrayss;

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1,1,4,5,3,4};
        SingleNumber ob = new SingleNumber();
        int number = ob.singleNumber1(nums);
        System.out.println(number);
    }
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
    public int singleNumber1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]){
                    isSingle = false;
                    break;
                }
            }
            if(isSingle){
                return nums[i];
            }
        }
        return -1;
    }
}