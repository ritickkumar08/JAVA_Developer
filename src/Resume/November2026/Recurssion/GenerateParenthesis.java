package Resume.November2026.Recurssion;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;

        GenerateParenthesis ob = new GenerateParenthesis();
        List<String> answer = ob.generateParenthesis(n);

        System.out.println(answer);
    }
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
//        if(n == 0){
//            return answer;
//        }
        backTrack(n,0, 0, answer, new StringBuilder());
        return answer;
    }

    private void backTrack(int n, int opening, int closing, List<String> answer, StringBuilder current) {
        if(current.length() == 2*n){
            answer.add(current.toString());
            return;
        }

        if(opening < n){
            current.append("(");
            backTrack(n, opening+1, closing, answer, current);
            current.deleteCharAt(current.length()-1);
        }
        if(closing < opening){
            current.append(")");
            backTrack(n, opening, closing+1, answer, current);
            current.deleteCharAt(current.length()-1);
        }
    }
}