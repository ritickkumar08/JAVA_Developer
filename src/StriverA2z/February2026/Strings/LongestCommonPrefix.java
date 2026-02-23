package StriverA2z.February2026.Strings;

import java.util.Arrays;

class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String answer = ob.longestCommonPrefix(strs);
        System.out.println(answer);
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        //sort the given array
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        //take the first string
        String first = strs[0];

        //and the last string
        String last = strs[strs.length-1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }
            //append the prefix if they are same
            sb.append(first.charAt(i));
        }
        //return the final prefix
        return sb.toString();
    }
}