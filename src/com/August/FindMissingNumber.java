package com.August;

public class FindMissingNumber {
    public int missingNumber(int[] nums){
        int missing = -1;
        int i = 0;
        int n = nums.length;
        //here we are sorting the array with cyclic sort
        while(i < n){
            int correct = nums[i];
            if(nums[i] < n - 1 && nums[i] != nums[correct]){ //as the array can have n as a value so we will only sort
                //if the element is lesser than the n the number of elements.
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        //as we know that the array is sorted and the elements are placed on the respective equal index
        for(int j = 0 ; j < n ; j++){
            if(nums[j] != j){//whenever the element is not equal to the index return the index
                missing = j;
                break;
            }else{
                missing = n;//this condition executes when the value of n is the missing number
            }
        }
        return missing;
    }
    private void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {0,1};

        FindMissingNumber ob = new FindMissingNumber();
        int number = ob.missingNumber(arr);
        System.out.println(number);
    }
}
