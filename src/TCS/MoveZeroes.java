package TCS;

import java.util.Arrays;

class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};
        MoveZeroes ob = new MoveZeroes();
        ob.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1; //this will point to the zero elements
        //finding the first zero element.
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        //if after traversal the j is -1 then there are no zeros.
        if(j == -1){
            return;
        }

        for (int i = j; i < n; i++) {
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}