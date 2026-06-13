package June2026.TwoPointerAndSlidingWindow.Hard;

import java.util.HashMap;
import java.util.Map;

class LongestSubstring {
    public static void main(String[] args) {
        String s = "aaacb";
        int k = 3;

        LongestSubstring ob = new LongestSubstring();
        int ans = ob.longestSubstring(s, k);
        System.out.println(ans);
    }
    public int longestSubstring(String s, int k) {
        int maxLength = 0;

        for (int uniqueTarget = 1; uniqueTarget <= 26; uniqueTarget++) {
            int[] freq = new int[26];
            int left = 0;
            int unique = 0;        // distinct chars in window
            int countAtLeastK = 0; // chars with freq >= k

            for (int right = 0; right < s.length(); right++) {
                // expand right
                int rc = s.charAt(right) - 'a';
                if (freq[rc] == 0) unique++;
                freq[rc]++;
                if (freq[rc] == k) countAtLeastK++;

                // shrink left when unique chars exceed target
                while (unique > uniqueTarget) {
                    int lc = s.charAt(left) - 'a';
                    if (freq[lc] == k) countAtLeastK--;
                    freq[lc]--;
                    if (freq[lc] == 0) unique--;
                    left++;
                }

                // valid window — exactly uniqueTarget chars, all with freq >= k
                if (unique == uniqueTarget && unique == countAtLeastK) {
                    maxLength = Math.max(maxLength, right - left + 1);
                }
            }
        }
        return maxLength;
    }
}