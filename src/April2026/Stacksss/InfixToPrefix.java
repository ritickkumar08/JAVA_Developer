package April2026.Stacksss;

import java.util.Arrays;
import java.util.Stack;

class InfixToPrefix {
    public static void main(String[] args) {
        String s = "a*(b+c)/d";

        InfixToPrefix ob = new InfixToPrefix();
        String ans = ob.infixToPrefix(s);
        System.out.println(ans);
    }
    public String infixToPrefix(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        String reversed = reverseee(s);
        int i = 0;

        while (i < reversed.length()){
            char ch = reversed.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
                ans.append(ch);
            }else if(ch == '('){
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '('){
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop();
            }else {
                while (!st.isEmpty() && st.peek() != '(' &&
                        (ch == '^' ? priority(ch) <= priority(st.peek())
                        : priority(ch) < priority(st.peek()))){
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
        return ans.reverse().toString();
    }

    private int priority(char ch) {
        if(ch == '^') return 3;
        else if(ch == '/' || ch == '*') return 2;
        else if(ch == '-' || ch == '+') return 1;
        return -1;
    }

    private String reverseee(String s) {
        char[] sArr = s.toCharArray();
        int left = 0;
        int right = sArr.length-1;

        while (left < right){
            char temp = sArr[left];
            sArr[left] = sArr[right];
            sArr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < sArr.length; i++){
            if(sArr[i] == '('){
                sArr[i] = ')';
            } else if (sArr[i] == ')') {
                sArr[i] = '(';
            }
        }
        return new String(sArr);
    }
}