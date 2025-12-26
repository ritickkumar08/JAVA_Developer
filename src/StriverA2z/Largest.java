package StriverA2z;

public class Largest {
    public static void main(String[] args) {
        int[] nums = {2,6,7,6,8,2,1,0,4,2,9,53,9,4,2,9,1,0,314,8,0,7,4,3,80,44,2,804,7,5,3,07,4,5,4,3};
        Largest ob = new Largest();
        int largest = ob.findLargest(nums);
        System.out.println(largest);
    }

    private int findLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
