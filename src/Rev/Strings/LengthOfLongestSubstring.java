package Rev.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "";

        LengthOfLongestSubstring ob = new LengthOfLongestSubstring();
        int ans = ob.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public int lengthOfLongestSubstring1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if(map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch) + 1;
            }

            map.put(ch, right);
            longest = Math.max(longest, right - left+1);
        }
        return longest;
    }

    public int lengthOfLongestSubstring(String s) {
        int longest = 0;

        for (int left = 0; left < s.length(); left++) {
            for (int right = left+1; right <= s.length(); right++) {
                if(allUnique(s,left,right)){
                    longest = Math.max(longest, right-left);
                }
            }
        }
        return longest;
    }

    private boolean allUnique(String s, int left, int right) {
        Set<Character> set = new HashSet<>();
        for (int i = left; i < right; i++) {
            if(!set.add(s.charAt(i))) return false;
        }
        return true;
    }
}