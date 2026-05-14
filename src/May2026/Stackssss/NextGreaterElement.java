package May2026.Stackssss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        NextGreaterElement ob = new NextGreaterElement();
        int[] ans = ob.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = -1;
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
               if(nums1[i] == nums2[j]){
                   found = true;
               }

               if(found && nums2[j] > nums1[i]){
                   ans[i] = nums2[j];
                   break;
               }
            }
        }
        return ans;
    }
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums2){
            while(!st.isEmpty() && st.peek() < num){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        while (!st.isEmpty()){
            map.put(st.pop(), -1);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < nums2[i]){
                st.pop();
            }
            map.put(nums2[i], st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }


        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}