package StriverA2z.February2026.Strings;

import java.util.HashMap;

class RomanToInt {
    public static void main(String[] args) {
        String s = "XII";
        RomanToInt ob = new RomanToInt();
        int number = ob.romanToInt(s);
        System.out.println(number);
    }
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int value = 0;

        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);

            if(roman.get(ch) < roman.get(s.charAt(i+1))){
                value -= roman.get(ch);
            }else {
                value += roman.get(ch);
            }
        }

        return value + roman.get(s.charAt(s.length()-1));
    }
}