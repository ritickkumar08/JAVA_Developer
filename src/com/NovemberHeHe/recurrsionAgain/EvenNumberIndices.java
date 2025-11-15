package com.NovemberHeHe.recurrsionAgain;

import java.util.Arrays;

public class EvenNumberIndices {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,6,677,7,8,8,6,5,3,2,2,34,7,65,432,123};
        EvenNumberIndices ob = new EvenNumberIndices();
        int[] result = ob.evenNumberIndices(nums,0,0);
        System.out.println(Arrays.toString(result));
    }

    private int[] evenNumberIndices(int[] nums, int i, int newIndex) {
        if(i == nums.length){
            return new int[newIndex];
        }

        if(nums[i] % 2 == 0){
            int[] answer = evenNumberIndices(nums, i+1, newIndex+1);
            answer[newIndex] = i;
            return answer;
        }else {
            int[] answer = evenNumberIndices(nums, i+1, newIndex);
            return answer;
        }
    }
}
