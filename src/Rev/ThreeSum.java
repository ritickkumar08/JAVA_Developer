package Rev;

import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> result = ob.threeSum(nums);
        System.out.println(result);
    }
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        Collections.sort(list);
                        if(!set.contains(list)){
                            set.add(list);
                            answer.add(list);
                        }
                    }
                }
            }
        }
        return answer;
    }
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i+1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);

                List<Integer> list = new ArrayList<>();
                if(st.contains(third)){

                    list.addAll(Arrays.asList(nums[i], nums[j] ,third));
                    Collections.sort(list);

                    if(!set.contains(list)){
                        set.add(list);
                        answer.add(list);
                    }
                }
                st.add(nums[j]);
            }
        }
        return answer;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicates for first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int start = i+1;
            int end = nums.length-1;

            while (start < end){
                int total = nums[i] + nums[start] + nums[end];
                if(total == 0){
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i] , nums[start] , nums[end]));
                    ans.add(list);
                    start++;
                    end--;

                    while (start < end && nums[start] == nums[start-1]) start++;
                    while (end > start && nums[end] == nums[end+1]) end--;
                }
                else if(total < 0 ){
                    start++;
                }else {
                    end--;
                }
            }
        }
        return ans;
    }
}