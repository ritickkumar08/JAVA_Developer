package DailyProblems;

import java.util.HashMap;

class LongestBalanced {
    public static void main(String[] args) {
        String str = "abbac";
        LongestBalanced ob = new LongestBalanced();
        int length = ob.longestBalanced(str);
        System.out.println(length);
    }
    public int longestBalanced(String s) {
        HashMap<String, Integer> map = new HashMap<>();

//        for (int i = 0; i < s.length(); i++) {
//            if(map.containsKey(s.charAt(i))){
//                map.get(charAt(i))
//            }
//        }
        return 0;
    }
}