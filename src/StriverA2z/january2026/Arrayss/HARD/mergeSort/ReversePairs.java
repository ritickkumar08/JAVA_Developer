package StriverA2z.january2026.Arrayss.HARD.mergeSort;

import java.util.ArrayList;
import java.util.Arrays;

class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        ReversePairs ob = new ReversePairs();
        int pairs = ob.reversePairs(nums);
        System.out.println(pairs);
    }
    public int reversePairs(int[] nums) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j] *2){
                    ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(i,j));
//                    newList.add(i);
//                    newList.add(j);
                    list.add(newList);
                    count++;
                }
            }
        }

        System.out.println(list);
        return count;
    }
}