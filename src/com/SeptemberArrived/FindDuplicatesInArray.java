package com.SeptemberArrived;

import java.util.ArrayList;

class FindDuplicatesInArray {
    public ArrayList<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        while(i < nums.length) {// the loop runs till our index is less than the length of the array
            int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                }else{
                    i++;
                }
            }
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] - 1 != j){
                list.add(nums[j]);
            }
        }
        return list;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        FindDuplicatesInArray ob = new FindDuplicatesInArray();
        ArrayList<Integer> duplicates = ob.findDuplicates(arr);
        System.out.println(duplicates);

    }
}