package Rev.Strings;

class CheckInclusion {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        CheckInclusion ob = new CheckInclusion();
        boolean ans = ob.checkInclusion(s1, s2);
        System.out.println(ans);
    }
    public boolean checkInclusion1(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int n = s1.length();
        int m = s2.length();

        int[] s1Freq = new int[26];

        for (int i = 0; i < n; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i<= m-n; i++){
            int[] s2Freq = new int[26];
            for (int j = 0; j < n; j++) {
                s2Freq[s2.charAt(j) - 'a']++;
            }
            if (isMatched(s1Freq, s2Freq)){
                return true;
            }
        }
        return false;
    }

    private boolean isMatched(int[] s1Freq, int[] s2Freq) {
        for (int i = 0; i < 26; i++) {
            if(s1Freq[i] != s2Freq[i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int n = s1.length();
        int m = s2.length();

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for (int i = 0; i < n; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }
        //for initial window
        if (isMatched(s1Freq, s2Freq)){
            return true;
        }

        for (int i = 1; i<= m-n; i++){
            s2Freq[s2.charAt(i-1) - 'a']--;
            s2Freq[s2.charAt(i+n-1) - 'a']++;

            if (isMatched(s1Freq, s2Freq)){
                return true;
            }
        }
        return false;
    }
}