package StriverA2z.january2026.Arrayss.HARD.Sums;

import java.util.*;

public class Quadruplets {
    public static void main(String[] args) {
        int[] nums = {0,0,2,1,1};
        int target = 3;
        Quadruplets ob = new Quadruplets();
        ArrayList<ArrayList<Integer>> quadruplets = ob.fourSum(nums,target);
        System.out.println(quadruplets);
    }
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        Set<ArrayList<Integer>> allQuadruplets = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                Set<Integer> newSet = new HashSet<>();
                for (int k = j+1; k < n; k++) {
                    long required = (long) target - arr[i] - arr[j] - arr[k];

                    if(newSet.contains((int)required)){
                        ArrayList<Integer> quadraplet = new ArrayList<>(List.of(arr[i],arr[j],arr[k],(int)required));
                        Collections.sort(quadraplet);
                        allQuadruplets.add(quadraplet);
                    }
                    newSet.add(arr[k]);
                }
            }
        }

        return new ArrayList<>(allQuadruplets);
    }
}
