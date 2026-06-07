package June2026.TwoPointerAndSlidingWindow;

import java.util.HashMap;

class CharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        CharacterReplacement ob = new CharacterReplacement();
        int ans = ob.characterReplacement(s, k);
        System.out.println(ans);
    }
    public int characterReplacement1(String s, int k) {
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; //a hash array with the 26 alphabetical characters.
            int maxFreq = 0; //a variable to hold the character with the maximum frequency.
//            int length = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j); // the character which we are having at the moment.

                //increment the frequency of the current character
                freq[s.charAt(j) - 'A']++;
                //update the maxFreq to the character with highest frequency.
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

                //now the window size of the sub Array is
                int window = j-i+1;

                //the replacements needed in the current window is
                int replacements = window - maxFreq;

                //now if the replacements are lesser or equal to the given k then it is valid sub array
                if(replacements <= k){
                    longest = Math.max(longest, window);
                }
            }
        }
        return longest;
    }

    //the better approach with two pointer and sliding window method.
    public int characterReplacement(String s, int k) {
        int longest = 0; // the variable to store the longest sub string.
        int[] freq = new int[26]; //array to store the frequency of the encountered characters
        int left = 0;
        int right = 0;
        int maxFreq = 0;

        while (right < s.length()){
            //increment the frequency of the current character in the frequency array.
            freq[s.charAt(right) - 'A']++;
            //finding the frequency of character with maximum frequency.
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            //finding the current window size.
            int windowSize = right - left +1;
            //and the replacements needed till now
            int replacements = windowSize - maxFreq;

            if (replacements > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(windowSize, longest);
            right++;
        }
        return longest;
    }
}