package TCS;

import java.util.Stack;

public class GreaterThanPrior {
    public static void main(String[] args) {
        int[] nums = {7,4,8,2,9,10};
        GreaterThanPrior ob = new GreaterThanPrior();
        int count = ob.greater1(nums);
        System.out.println(count);
    }

    private int greater(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
//        Stack<Integer> st = new Stack<>();
//        st.push(nums[0]);
        int count = 1;
        int maxi = nums[0];

        for (int i = 1; i < nums.length; i++) {
           if(nums[i] > nums[i-1]){
               count++;
           }
           maxi = Math.max(maxi, nums[i]);
        }
        return count;
    }
    private int greater1(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            while (!st.isEmpty() && st.peek() < nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                count++;
            }

            st.push(nums[i]);
        }
        return count;
    }
}
