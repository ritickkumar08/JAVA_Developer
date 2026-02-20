package StriverA2z.February2026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MakeLargestSpecial {
    public static void main(String[] args) {
        String s = "11011000";
        MakeLargestSpecial ob = new MakeLargestSpecial();
        String answer = ob.makeLargestSpecial(s);
        System.out.println(answer);
    }
    public String makeLargestSpecial(String s) {
        List<String> parts = new ArrayList<>();

        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
            else count--;

            if (count == 0) {
                // inner substring without outer 1 and 0
                String inner = s.substring(start + 1, i);
                String optimized = makeLargestSpecial(inner);
                parts.add("1" + optimized + "0");
                start = i + 1;
            }
        }

        // sort descending
        Collections.sort(parts, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (String part : parts) result.append(part);

        return result.toString();
    }
}
