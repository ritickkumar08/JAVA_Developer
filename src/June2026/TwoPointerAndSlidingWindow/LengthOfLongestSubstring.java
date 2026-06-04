package June2026.TwoPointerAndSlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";

        LengthOfLongestSubstring ob = new LengthOfLongestSubstring();
        int ans = ob.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public int lengthOfLongestSubstring1(String s) {
        int maxlength = 0;

        for (int i = 0; i < s.length(); i++) {
            int length = 0;
            Set<Character> st = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (!st.add(ch)){
                    break;
                }
                length++;
            }
            maxlength = Math.max(maxlength, length);
        }
        return maxlength;
    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>(); //this map contains the character and the index where it
        //was seen.
        int maxlength = 0; //variable to store the maxLength of the subarray.
        int left = 0; //the pointer to point at the left or starting of the subarray.
        int right = 0; //to point at the end of the current subarray.

        while (right < s.length()){
            char ch = s.charAt(right);
            int length;

            //here we check if the current character was seen before if yes then we will have to update the left
            //pointer to the next character to the character which is duplicate or has been pointed by right at this
            //point
            if (map.containsKey(ch) && left <= map.get(ch)){
                left = map.get(ch) + 1;
//                map.put(ch, right);
            }

            //the calculation of the current length of the subarray without any duplicates.
            map.put(ch, right);
            length = right - left + 1;
            //reassigning the maxlength if we find a greater length.
            maxlength = Math.max(length, maxlength);

            right++;
        }

        return maxlength;
    }
}