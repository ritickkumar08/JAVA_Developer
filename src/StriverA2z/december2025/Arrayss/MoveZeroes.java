package StriverA2z.december2025.Arrayss;

import java.util.Arrays;

class MoveZeroes {
    public static void main(String[] args) {
        int[] nums ={0,1,0,3,12};
        MoveZeroes ob = new MoveZeroes();
        ob.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zeros = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0){
                nums[zeros++] = nums[i];
            }
        }

        for (int j = zeros; j < n ; j++) {
            nums[j] = 0;
        }

    }
}