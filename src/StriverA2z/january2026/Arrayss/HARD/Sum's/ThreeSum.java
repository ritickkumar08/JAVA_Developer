package StriverA2z.january2026.Arrayss.HARD.Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public static void main(String[] args) {
        int[] nums ={-1,0,1,2,-1,-4};
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> answer = ob.threeSum(nums);
        System.out.println(answer);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> zeroSums = new ArrayList<>();
        int n = nums.length;
        if(n < 3){
            return zeroSums;
        }

        for (int i = 0; i < n; i++) {
            int first = i;
            int second = i+1;
            int sum = nums[first] + nums[second];
            int complement = sum * (-1);
            List<Integer> oneList = new ArrayList<>(Arrays.asList(0,0,0));

//            for (int j = i+2; j < n; j++) {
//                if(nums[j] == complement){
//                    oneList.set(nums[first],nums[second],nums[j]);
//                }
//            }
            zeroSums.add(oneList);
        }

        return zeroSums;
    }
}