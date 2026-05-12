package April2026.Stacksss;

import java.util.Stack;

class InfixToPostfix {
    public static void main(String[] args) {
        String  s = "a+b*(c^d-e)^(f+g*h)-i";

        String ans = infixToPostfix(s);
        System.out.println(ans);
    }
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < s.length()){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '('){
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop(); // pop '('
            } else {
                while (!st.isEmpty() && st.peek() != '(' && isLeftAssociative(ch) && priority(ch) <= priority(st.peek())){
                    ans.append(st.peek());
                    st.pop();
                }
                st.push(ch);
            }
            i++;
        }
        while (!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.toString();

    }

    private static int priority(char ch) {
        if (ch == '^')             return 3;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;  // Fix 5
        else return -1;
    }
    private static boolean isLeftAssociative(char ch) {
        return ch != '^'; // only ^ is right-associative
    }
}