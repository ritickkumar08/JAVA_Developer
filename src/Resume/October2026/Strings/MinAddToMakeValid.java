package Resume.October2026.Strings;

import java.util.Stack;

class MinAddToMakeValid {
    public static void main(String[] args) {
        String s = "()))((";

        MinAddToMakeValid ob = new MinAddToMakeValid();
        int ans = ob.minAddToMakeValid(s);
        System.out.println(ans);
    }
    public int minAddToMakeValid(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        Stack<Character> st = new Stack<>();

        int closing = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push('(');
                continue;
            }

            if(!st.isEmpty() && ch == ')'){
                st.pop();
            }else {
                closing++;
            }


        }
        return closing+st.size();
    }
}