package StriverA2z.February2026.Strings;

import java.util.Scanner;

class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        RotateString ob = new RotateString();
        boolean rotation = ob.rotateString(s,goal);
        System.out.println(rotation);
    }
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String doubledS = s+s;

        return doubledS.contains(goal);
    }
}