package com.LetsGrindTheHellOutOfDecember;

class CheckIfExist {
    public static void main(String[] args) {
        int[] nums = {0,-2,2};
        CheckIfExist ob = new CheckIfExist();
        boolean exists = ob.checkIfExist(nums);
        System.out.println(exists);
    }
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int doubled = arr[i]*2;
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    continue;
                }
                if(arr[j] == doubled){
                    return true;
                }
            }
        }
        return false;
    }
}