package May2026.Stackssss;

import java.util.Stack;

class RemoveKdigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;

        RemoveKdigits ob = new RemoveKdigits();
        String ans = ob.removeKdigits(num, k);
        System.out.println(ans);
    }
    public String removeKdigits(String num, int k) {
        if (k == num.length()){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        char[] cArr = num.toCharArray();
//        System.out.println(cArr[0]);


        for (int i = 0; i < cArr.length; i++) {
            while(!st.isEmpty() && k>0 && (st.peek() - '0') > (cArr[i] - '0')){
                st.pop();
                k--;
            }
            st.push(cArr[i]);
        }
        // remove remaining k elements from the end
        while (k > 0) {
            st.pop();
            k--;
        }
        if (st.isEmpty()) return "0";

        //build and reverse
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()){
            result.append(st.pop());
        }
        result.reverse();

        while (result.length() > 1 && result.charAt(0) == '0'){
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}