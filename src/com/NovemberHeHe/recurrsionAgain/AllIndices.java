package com.NovemberHeHe.recurrsionAgain;

import java.util.ArrayList;
import java.util.Arrays;

public class AllIndices {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3,45,6,4,56,87,9,43,1};
        int k = 2;
        AllIndices ob = new AllIndices();
        int[] result = ob.allIndices(nums, k, 0, 0);
        System.out.println(Arrays.toString(result));
    }

    private int[] allIndices(int[] nums, int target, int i, int fsf) {
        if(i == nums.length){
            return new int[fsf];
        }

        if(nums[i] == target){
            int[] result = allIndices(nums, target, i + 1, fsf + 1);
            result[fsf] = i;
            return result;
        }else {
           int[] result = allIndices(nums, target, i + 1, fsf);
            return result;
        }

    }

}
