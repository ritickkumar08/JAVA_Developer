package May2026.Subarray;

import java.util.HashMap;

class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String st = "abba";

        LengthOfLongestSubstring ob = new LengthOfLongestSubstring();
        int ans = ob.lengthOfLongestSubstring(st);
        System.out.println(ans);
    }
    public int lengthOfLongestSubstring1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch) + 1;
            }

            map.put(ch, right);
            longest = Math.max(longest, right-left+1);
        }
        return longest;
    }
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        int left = 0;
        int right = 0;
        int longest = 0;

        while (right < s.length()){
             /* If current character s.charAt(r) is already in the substring */
            if (hash[s.charAt(right)] >= left){
                left = Math.max(hash[s.charAt(right)] + 1, left);
            }

            // Calculate the current substring length
            int len = right - left + 1;

            // Update maximum length found so far
            longest = Math.max(len, longest);

            /* Store the index of the current
               character in the hash table */
            hash[s.charAt(right)] = right;

            // Move right pointer to next position
            right++;
        }

        return longest;
    }

}