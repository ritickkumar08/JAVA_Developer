package StriverA2z.january2026.Arrayss;

import java.util.ArrayList;

public class PrintSubArrayWithMaxSum {
    public static void main(String[] args) {
        int[] nums = {-71, 92, 0, 67, -8, 67, -78, -7};
        PrintSubArrayWithMaxSum ob = new PrintSubArrayWithMaxSum();
        ArrayList<Integer> list = ob.printSubArray(nums);
        System.out.println(list);
    }

    private ArrayList<Integer> printSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int currentSum = nums[0];
        int bestSum  = nums[0];

        int currentStart = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < nums.length ; i++)
            {
                if(nums[i] > currentSum + nums[i]){
                    currentSum = nums[i];
                    currentStart = i;
                }else {
                    currentSum += nums[i];
                }
                if(currentSum > bestSum){
                    bestSum = currentSum;

                    bestStart = currentStart;
                    bestEnd = i;
                }

        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (int j = bestStart; j <= bestEnd; j++) {
            answer.add(nums[j]);
        }

        return answer;
    }

}
