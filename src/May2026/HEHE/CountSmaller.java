package May2026.HEHE;

import java.util.*;

class CountSmaller {
    public static void main(String[] args) {
        int[] nums = {-1,-1};

        CountSmaller ob = new CountSmaller();
        List<Integer> ans = ob.countSmaller(nums);
        System.out.println(ans);
    }
    public List<Integer> countSmaller1(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length ; i++){
            int count = 0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = nums.length-1 ; i >=0 ; i--) {
            while (!st.isEmpty() && st.peek() >= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(0);
            }else {
                ans.add(st.size());
            }

            st.push(nums[i]);
        }

        Collections.reverse(ans);
        return ans;
    }
}