package June2026.TwoPointerAndSlidingWindow.Hard;

import java.util.HashMap;

class MinWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        MinWindow ob = new MinWindow();
        String ans = ob.minWindow(s, t);
        System.out.println(ans);
    }
    public String minWindow1(String s, String t) {
        int minLength = Integer.MAX_VALUE;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int length;
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                length = j - i + 1;

                if (contains(sb.toString(), t) && length < minLength){
                    minLength = Math.min(length, minLength);
                    ans = sb.toString();
                    break; // inner optimization: no need to grow window further
                }
            }
        }
        return ans;
    }

    private boolean contains(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()){
            if (map.containsKey(ch))
            map.put(ch, map.get(ch) - 1);
        }

        for (int val : map.values())
            if (val > 0) return false;

        return true;
    }


    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return ""; //If s is smaller than t, it's impossible to contain all characters.

        // Step 1: frequency map of t
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1); //Build frequency map of t.
        }

        int required = map.size(); //Number of unique characters we need to satisfy.
        int formed = 0; //Tracks how many unique characters are fully satisfied.
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sIndex = -1;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);//current character.

            if (map.containsKey(c)){
                map.put(c, map.get(c) - 1);//Reduce requirement because we found this character in the window.
                if (map.get(c) == 0) { //When count becomes exactly 0, it means:
                    // We have collected enough of this character
                    formed++;
                }
            }

            while (formed == required){ //Current window is VALID (contains all required chars)
                if (right - left + 1 < minLength){
                    minLength = right - left + 1;
                    sIndex = left;
                }

                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) formed--;
                }
                left++;
            }
        }
        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLength);
    }
}