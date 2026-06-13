package June2026.TwoPointerAndSlidingWindow.Hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class LongestKSubstr {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        LongestKSubstr ob = new LongestKSubstr();
        int ans = ob.longestKSubstr(s, k);
        System.out.println(ans);
    }
    public int longestKSubstr1(String s, int k) {
        // code here
        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            int length = 0;
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                set.add(s.charAt(j));
                if (set.size() > k) break;
                length++;
                if (set.size() == k){ // exactly k unique
                    maxLength = Math.max(length, maxLength);
                }

            }
        }
        return maxLength;
    }

    //a better approach with two pointer and sliding window technique.
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = -1;
        int left = 0;
        int right = 0;

        while (right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);

            while (map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) map.remove(leftChar);
                left++;
            }

            if (map.size() == k){
                maxLength = Math.max(maxLength, right-left+1);
            }

            right++;
        }

        return maxLength;
    }
}