package Resume.October2026.Recurssion.backTracking;

import java.util.ArrayList;
import java.util.List;

class AddOperators {
    public static void main(String[] args) {
        String num = "123";
        int target = 6;
        AddOperators ob = new AddOperators();
        List<String> ans = ob.addOperators(num, target);
        System.out.println(ans);
    }
    public List<String> addOperators(String num, int target) {
        List<String> answer = new ArrayList<>();
        backTrack(num, target, answer, new StringBuilder(), 0, 0, 0);
        return answer;
    }

    private void backTrack(String num, int target, List<String> answer, StringBuilder expression, int start, long currentVal, long prevOpreand) {
        if(start == num.length()){
            if(currentVal == target){
                answer.add(expression.toString());
            }
            return;
        }

        int length = expression.length();
        for (int i = start; i < num.length(); i++) {
            if(i > start && num.charAt(start) == '0'){
                break;
            }

            String sub = num.substring(start, i+1);
            long val = Long.parseLong(sub);

            if(start == 0){
                expression.append(sub);
                backTrack(num, target, answer, expression, i+1, val, val);
                expression.setLength(length);
            }else {
                expression.append('+').append(sub);
                backTrack(num, target, answer, expression, i+1, currentVal+val, val);
                expression.setLength(length);

                expression.append('-').append(sub);
                backTrack(num, target, answer, expression, i+1, currentVal-val, -val);
                expression.setLength(length);

                expression.append('*').append(sub);
                backTrack(num, target, answer, expression, i+1, (currentVal-prevOpreand)+(val*prevOpreand), currentVal*val);
                expression.setLength(length);
            }
        }
    }

}