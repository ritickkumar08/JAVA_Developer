package April2026.BitManipulation;

import java.util.ArrayList;
import java.util.List;

class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        Subsets ob = new Subsets();
        List<List<Integer>> ans = ob.subsets(nums);
        System.out.println(ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;

        int subsets = 1<<n; //figuring out the number of subsets we can have 2^n.

        List<List<Integer>> ans = new ArrayList<>();

        for (int j = 0; j < subsets; j++){
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if((j & (1<<i)) != 0){
                    temp.add(nums[i]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}