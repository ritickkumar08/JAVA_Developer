package StriverA2z.january2026.Arrayss.HARD.SubArrays;

import java.util.HashMap;
import java.util.HashSet;

class MaxLength {
    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};
        MaxLength ob = new MaxLength();
        int length = ob.maxLength(nums);
        System.out.println(length);
    }
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == 0){
                maxLength = i+1;
            }
            else{
                if(mpp.containsKey(sum)){
                    maxLength = Math.max(maxLength, i - mpp.get(sum));
                }else{
                    mpp.put(sum,i);
                }
            }

        }

        return maxLength;
    }
}