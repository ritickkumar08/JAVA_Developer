package May2026.Stackssss;

import java.util.Stack;

class IsValid {
    public static void main(String[] args) {
        String s = "()[]{}}";

        IsValid ob = new IsValid();
        boolean ans = ob.isValid(s);
        System.out.println(ans);
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
                continue; //The continue sends control to the next iteration of the loop immediately,
                //avoiding all the further conditions check.
            }

            //if the string starts with the closing parentheses, that implies stack will be empty
            if(st.isEmpty()){
                return false;
            }

            if(ch == ')' || ch == '}' || ch == ']'){
                if(ch == ')' && st.peek() == '('){
                    st.pop();
                }else if(ch == ']' && st.peek() == '['){
                    st.pop();
                } else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                }else {
                    return false;
                }
            }

//            st.push(ch);
        }
        return st.isEmpty();
    }
}