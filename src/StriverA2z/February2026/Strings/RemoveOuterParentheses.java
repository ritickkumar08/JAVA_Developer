package StriverA2z.February2026.Strings;

class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        RemoveOuterParentheses ob = new RemoveOuterParentheses();
        String answer = ob.removeOuterParentheses(s);
        System.out.println(answer);
    }
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int level = 0;

        for (char ch : s.toCharArray()){
            if(ch == '('){
                if(level > 0){
                    sb.append(ch);
                }level++;
            }else if (ch == ')') {
                level--;
                if (level > 0) sb.append(ch);;
            }
        }
        return sb.toString();
    }
}