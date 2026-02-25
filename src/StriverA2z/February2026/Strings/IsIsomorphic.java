package StriverA2z.February2026.Strings;

import java.util.HashMap;
import java.util.Scanner;

class IsIsomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String s = sc.next();
        System.out.println("enter second string");
        String t = sc.next();
        IsIsomorphic ob = new IsIsomorphic();
        boolean isomorphic = ob.isIsomorphic(s,t);
        System.out.println(isomorphic);
    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapS.containsKey(c1) && mapS.get(c1) != c2){
                return false;
            }
            if(mapT.containsKey(c2) && mapT.get(c2) != c1){
                return false;
            }

            mapS.put(c1, c2);
            mapT.put(c2, c1);
        }
        return true;
    }
}