package StriverA2z.February2026.Strings;

import java.util.HashMap;

class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        IsAnagram ob = new IsAnagram();
        boolean yes = ob.isAnagram(s,t);
        System.out.println(yes);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            map.put(c,map.getOrDefault(c, 0) +1);
        }

        for (char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) -1);
            if(map.get(c) < 0) return false;
        }

        return true;
    }
    public boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr = new int[26];
        System.out.println(arr);

        for (char c : s.toCharArray()){
            arr[c -'a']++;
        }
        for (char c : t.toCharArray()){
            arr[c - 'a']--;
        }

        for (int freq : arr){
            if(freq != 0) return false;
        }

        return true;
    }
}