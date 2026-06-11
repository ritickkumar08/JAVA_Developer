package June2026.TwoPointerAndSlidingWindow;

class NumberOfSubstrings {
    public static void main(String[] args) {
        String s = "abcabc";

        NumberOfSubstrings ob = new NumberOfSubstrings();
        int ans = ob.numberOfSubstrings(s);
        System.out.println(ans);
    }
    public int numberOfSubstrings1(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sb.append(s.charAt(j));
                if (containsAll(sb.toString())){
                    count += (n-j);//optimized a little as we know that if we have found the three characters then the
                    //of the characters that will be added in future will have the three characters.
                    break;
                }
            }
        }
        return count;
    }

    private boolean containsAll(String s) {
        if (s.contains("a") && s.contains("b") && s.contains("c")) return true;

        return false;
    }


    //we can do this with a better approach using the two pointers and sliding window approach.
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int[] lastSeen = {-1,-1,-1};
        for (int i = 0; i < n; i++) {
            lastSeen[s.charAt(i) - 'a'] = i;

            count += (1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])));//here we directly are doing this
            //because if we don't have all the three characters then the minimum will be -1 which will then become 0
            //by adding 1 to it.
        }
        return count;
    }
}