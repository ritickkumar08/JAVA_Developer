package StriverA2z.February2026.Strings;

class ReverseWords {
    public static void main(String[] args) {
        ReverseWords ob = new ReverseWords();
        String s = "  hello world  ";
        String res = ob.reverseWords(s);
        System.out.println(res);
    }
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
//        String[] str = s.split(" ");
//
//        for (int i = str.length-1; i >= 0 ; i--) {
//            reverse.append(str[i]);
//        }
//        return reverse.toString();

        int i = s.length()-1;

        while(i >= 0){
            //find the end of the word in the given string
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            int end = i;

            //now find the starting of the word
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            //now we have the word.
            String word = s.substring(i+1, end+1);

            //add space if it is not the first word
            if(reverse.length() != 0){
                reverse.append(" ");
            }

            reverse.append(word);
        }
        return reverse.toString().trim();
    }
}