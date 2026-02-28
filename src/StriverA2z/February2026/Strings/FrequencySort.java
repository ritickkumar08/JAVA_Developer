package StriverA2z.February2026.Strings;

import java.util.Arrays;
import java.util.Scanner;

class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        FrequencySort ob = new FrequencySort();
        String ans = ob.frequencySort(s);
        System.out.println(ans);
    }

    public String frequencySort(String s) {
        //creating an array of characters frequency.
        Pairs[] freq = new Pairs[52];

        //initialize the frequency array.
        for (int i = 0; i < 26; i++) {
            freq[i] = new Pairs((char)('a'+ i), 0);
        }
        //initialize the frequency array.
        for (int i = 0; i < 26; i++) {
            freq[i] = new Pairs((char)('A'+ i), 0);
        }

        //counting the frequency of each character.
        // count frequency
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                freq[ch - 'a'].count++;
            } else if (Character.isUpperCase(ch)) {
                freq[ch - 'A' + 26].count++;
            }
        }

        //sorting the array on the basis of count and then by character in ascending order
        // sort by frequency desc, then by character asc
        Arrays.sort(freq, (p1, p2) -> {
            if (p1.count != p2.count) return p2.count - p1.count;
            return p1.c - p2.c;
        });


        //collect the characters with non-zero frequency.
        StringBuilder sb = new StringBuilder();
        for (Pairs p : freq) {
            for (int i = 0; i < p.count; i++) {
                sb.append(p.c);
            }
        }

        return sb.toString();
    }
}

// Inner class to store frequency and character
class Pairs{
    char c;
    int count;

    Pairs(char c, int count){
        this.c = c;
        this.count = count;
    }
}

