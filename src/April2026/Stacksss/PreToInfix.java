package April2026.Stacksss;

import java.util.Stack;

class PreToInfix {
    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";

        String ans = preToInfix(s);
        System.out.println(ans);
    }
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();
        int i = pre_exp.length()-1;

        while (i >= 0){
            char ch = pre_exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else {
                String first = st.pop();
                String second = st.pop();

                st.push("(" + first + ch + second + ")");
            }
            i--;
        }
        return st.pop();
    }
}