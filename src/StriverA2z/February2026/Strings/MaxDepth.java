package StriverA2z.February2026.Strings;

import java.util.Stack;

class MaxDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        MaxDepth ob = new MaxDepth();
        int depth = ob.maxDepth(s);
        System.out.println(depth);
    }
    public int maxDepth(String s) {
        int count = 0;
        int maxi = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '('){
                count++;
            } else if(ch == ')'){
                count--;
            }

            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
}