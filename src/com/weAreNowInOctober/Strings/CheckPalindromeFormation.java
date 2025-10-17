package com.weAreNowInOctober.Strings;

class CheckPalindromeFormation {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }

    private boolean check(String a, String b) {
        int i = 0 ; int j = b.length() - 1;
        while(i < j && a.charAt(i) == b.charAt(j)){
            i++;
            j--;
        }
        // Once mismatch occurs, check if remaining part of either string is palindrome
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "abdef";
        String b = "fecab";
        CheckPalindromeFormation ob = new CheckPalindromeFormation();
        boolean result = ob.checkPalindromeFormation(a,b);
        System.out.println(result);
    }
}