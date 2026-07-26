package June2026.TwoPointerAndSlidingWindow.Hard;

import java.util.HashMap;

class MinWindow1 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        MinWindow1 ob = new MinWindow1();
        String ans = ob.minWindow(s, t);
        System.out.println(ans);
    }
    public String minWindow(String s, String t) {

        // If pattern is larger than source, no valid window is possible
        if (t.length() > s.length()) return "";

        // Frequency map to store how many of each character we still need from pattern
        HashMap<Character, Integer> requiredCount = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            requiredCount.put(t.charAt(i), requiredCount.getOrDefault(t.charAt(i), 0) + 1);
        }
        // Number of unique characters that must be fully matched
        int totalUniqueRequired = requiredCount.size();
        // Number of unique characters that are currently satisfied in the window
        int satisfiedUniqueCount = 0;
        // Track best window found so far
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStartIndex = -1;
        //the pointer to the left or the start of the window.
        int left = 0;


        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // If current character is needed for pattern matching
            if (requiredCount.containsKey(rightChar)){
                // Reduce requirement (we are fulfilling it using current window)
                requiredCount.put(rightChar, requiredCount.get(rightChar)-1);
                // If requirement for this character is fully satisfied
                if (requiredCount.get(rightChar) == 0){
                    satisfiedUniqueCount++;
                }
            }

            // If all unique characters are satisfied, try shrinking window
            while (satisfiedUniqueCount == totalUniqueRequired){
                // Update best window if current one is smaller
                if (right - left + 1 < minWindowLength){
                    minWindowLength = right - left + 1;
                    minWindowStartIndex = left;
                }

                char leftChar = s.charAt(left); //Character that will be removed from the window.
                if (requiredCount.containsKey(leftChar)){ //Again, only care if it's part of t.
                    requiredCount.put(leftChar, requiredCount.get(leftChar) + 1);//We're removing this character → so requirement increases.
                    if (requiredCount.get(leftChar) > 0){ //If requirement becomes positive, we just broke validity.
                        satisfiedUniqueCount--;
                    }
                }
                left++; //Shrink window from the left.
            }
        }
        return minWindowStartIndex == -1 ? "" : s.substring(minWindowStartIndex, minWindowStartIndex+minWindowLength);
    }
}