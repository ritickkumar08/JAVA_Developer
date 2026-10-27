package Resume.October2026.Strings;

class LongestPrefix {
    public static void main(String[] args) {
        String s = "ababab";

        LongestPrefix ob = new LongestPrefix();
        String ans = ob.longestPrefix(s);
        System.out.println(ans);
    }
    public String longestPrefix(String s) {
        String answer = "";
        if(s == null || s.length() == 0){
            return "";
        }

        int longest = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String prefix = s.substring(0,i+1);
            for (int j = 1; j < n; j++) {
                String sufix = s.substring(j, n);
                if(prefix.length() != sufix.length()){
                    continue;
                }
                if (sufix.equals(prefix)){
                    if(i+1 > longest){
                        answer = s.substring(0,i+1);
                        longest = i+1;
                    }
                }
            }
        }
        return answer;
    }
}