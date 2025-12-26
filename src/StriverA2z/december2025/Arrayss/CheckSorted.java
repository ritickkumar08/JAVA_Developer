package StriverA2z.december2025.Arrayss;

public class CheckSorted {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        CheckSorted ob = new CheckSorted();
        boolean sorted = ob.check(nums);
        System.out.println(sorted);
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        int drops = 0;
        for (int i = 0; i < n-1 ; i++) {
            if(nums[i] > nums[i + 1] ){
                drops++;
            }
        }
        if(nums[n-1] > nums[0]){
            drops++;
        }

        return drops <= 1;
    }
}
