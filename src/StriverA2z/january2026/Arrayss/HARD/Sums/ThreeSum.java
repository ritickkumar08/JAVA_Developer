package StriverA2z.january2026.Arrayss.HARD.Sums;

import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> triples = ob.threeSum(nums);
        System.out.println(triples);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> allTriples = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> hashSet = new HashSet<>();

            for (int j = i+1; j < n; j++) {
                int third = -(nums[i] + nums[j]);

                if(hashSet.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    allTriples.add(temp);
                }
                hashSet.add(nums[j]);
            }
        }

        return new ArrayList<>(allTriples);
    }
}