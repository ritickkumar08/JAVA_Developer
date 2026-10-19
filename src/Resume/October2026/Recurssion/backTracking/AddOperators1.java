package Resume.October2026.Recurssion.backTracking;

import java.util.ArrayList;
import java.util.List;

class AddOperators1 {
    public static void main(String[] args) {
        String num = "123";
        int target = 6;

        AddOperators1 ob = new AddOperators1();
        List<String> answer = ob.addOperators(num, target);
        System.out.println(answer);
    }
    public List<String> addOperators(String num, int target) {
        List<String> answer = new ArrayList<>();
        if(num == null || num.length() == 0){
            return answer;
        }
        backTrack(num, answer, new StringBuilder(), target, 0, 0, 0);
        return answer;
    }

    private void backTrack(String num, List<String> answer, StringBuilder expression, int target, int start, long value, long preOperand) {
        if (start == num.length()){
            if(value == target){
                answer.add(expression.toString());
            }
            return;
        }

        int length = expression.length(); // we are using this so that while backtracking we can reduce the expression
        // to the same. it helps in removing multiple characters added during the process.
        for (int i = start; i < num.length(); i++) {

            if(i > start && num.charAt(start) == '0'){
                break;
            }

            String sub = num.substring(start, i+1);
            long val = Long.parseLong(sub);

            if(start == 0){
                expression.append(sub);
                backTrack(num, answer, expression, target, i+1, val, val);
                expression.setLength(length);// this resets the expression to the length it was at the time of entry.
            }else {
                expression.append('+').append(sub);
                backTrack(num, answer,expression,target, i+1, value+val, val);
                expression.setLength(length);


                expression.append('-').append(sub);
                backTrack(num, answer, expression, target, i+1, value-val, -val);
                expression.setLength(length);

                expression.append('*').append(sub);
                backTrack(num, answer, expression, target, i+1, (value-preOperand)+(preOperand*val), preOperand*val);
                expression.setLength(length);
            }
        }
    }
}