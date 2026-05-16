package May2026.Stackssss;

import java.util.HashMap;
import java.util.Stack;

class Count_NGE {
    public static void main(String[] args) {
        int[] arr = {};
        int[] indices = {};

        int[] ans = count_NGE(arr, indices);
        System.out.println(ans);
    }
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length-1 ; i >= 0 ; i++) {
            while (!st.isEmpty()){

            }
        }
        return new int[]{0};
    }
}