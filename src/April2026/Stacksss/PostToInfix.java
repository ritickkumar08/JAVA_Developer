package April2026.Stacksss;

import java.util.Stack;

class PostToInfix {
    public static void main(String[] args) {
        String s = "ab*c+";

        String ans = postToInfix(s);
        System.out.println(ans);
    }
    static String postToInfix(String exp) {
        // code here
//        StringBuilder ans = new StringBuilder();
        Stack<String> st = new Stack<>();
        int i = 0;

        while (i < exp.length()){
            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else {
                String first = st.pop();
                String second = st.pop();

                st.push("(" + second  + ch + first + ")");
            }
            i++;
        }
        return st.peek();
    }
}