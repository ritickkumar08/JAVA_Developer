package Rev.Strings;

import java.util.Arrays;

class IsAnagram {
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";

        IsAnagram ob = new IsAnagram();
        boolean ans = ob.isAnagram(s,t);
        System.out.println(ans);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] Schar = s.toCharArray();
        Arrays.sort(Schar);
        char[] Tchar = t.toCharArray();
        Arrays.sort(Tchar);

        for (int i = 0; i < s.length(); i++) {
            if(Schar[i] != Tchar[i]){
                return false;
            }
        }
        return true;
    }
}