package com.LetsGrindTheHellOutOfDecember;

//A pangram is a sentence where every letter of the English alphabet appears at least once.
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
// or false otherwise.
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.

class CheckIfPangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        CheckIfPangram ob = new CheckIfPangram();
        boolean check = ob.checkIfPangram(str);
        System.out.println(check);
    }
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int count = 0;

        for(char ch : sentence.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                int index = ch - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                    if(count == 26) return true;
                }
            }
        }
        return false;
    }
}