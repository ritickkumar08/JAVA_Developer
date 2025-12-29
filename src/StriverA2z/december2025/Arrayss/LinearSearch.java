package StriverA2z.december2025.Arrayss;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,7,8,7,3,8,6,2,4,9,8,4,2,8,3,4,9,3,5,9,9,9,5,0,9,2,8,0,4,8};
        int target = 6;
        LinearSearch ob = new LinearSearch();
        int index = ob.lineraSearch(nums,target);
        System.out.println(index);
    }

    private int lineraSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
