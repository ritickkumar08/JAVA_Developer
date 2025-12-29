package StriverA2z.december2025.Arrayss;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        MissingNumber2 ob = new MissingNumber2();
        int number = ob.missing(nums);
        System.out.println(number);
    }

    private int missing(int[] nums) {
        int missing = 0;
        int n = nums.length;
        int i = 0;
        while(i < n){
            int correct = nums[i];
            if(nums[i] < n - 1 && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if(nums[j] == j+1){
                missing = j;
                break;
            }else {
                missing = n;
            }
        }
        return missing;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
