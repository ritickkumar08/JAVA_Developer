package StriverA2z.december2025.Arrayss;

import java.util.Arrays;

class SortColors {
    public static void main(String[] args) {
        int[] colors = {2,0,2,1,1,0};
        SortColors ob = new SortColors();
        ob.sortColors(colors);
        System.out.println(Arrays.toString(colors));
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int two = n - 1;

        for (int i = 0; i <= two; i++) {
            if(nums[i] == 0){
                swap(nums, i, zero++);
            }
            if(nums[i] == 2){
                swap(nums, i, two--);
                i--;
            }
        }
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}