package StriverA2z.december2025.Arrayss;

import java.util.ArrayList;
import java.util.Arrays;

public class Dice {
    public static void main(String[] args) {
        Dice ob = new Dice();
        ob.dice("",4);

        ArrayList<String> answer = ob.dice1("", 4);
        System.out.println(answer);

    }

    private void dice(String s, int target) {
        if(target == 0){
            System.out.println(s);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(s + i, target - i);
        }
    }
    private ArrayList<String> dice1(String s, int target) {
        if(target == 0){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add(s);
            return baseCase;
        }

        ArrayList<String> answer = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            answer.addAll(dice1(s + i, target - i));
        }

        return answer;
    }
}
