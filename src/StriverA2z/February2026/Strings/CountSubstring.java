package StriverA2z.February2026.Strings;

class CountSubstring {
    public static void main(String[] args) {
        String s = "aaabc";
        int substrings = countSubstring(s);
        System.out.println(substrings);
    }
    public static int countSubstring(String s) {
        // code here
        if(!s.contains("abc") || !s.contains("a") || !s.contains("b") || !s.contains("c")) return 0;

        int[] count = new int[3];
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            // while window has at least one a, b, and c
            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                result += s.length() - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }
}