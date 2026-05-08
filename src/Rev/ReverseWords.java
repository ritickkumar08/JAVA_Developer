package Rev;

class ReverseWords {
    public static void main(String[] args) {
        String word = "the sky is blue";

        ReverseWords ob = new ReverseWords();
        String ans = ob.reverseWords(word);
        System.out.println(ans);
    }
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int i = s.length()-1;

        while (i>=0){
            while (i>=0 && s.charAt(i) == ' '){
                i--;
            }
            int end = i;

            while (i >=0 && s.charAt(i) != ' '){
                i--;
            }

            String current = s.substring(i+1, end+1);

            if(ans.length() != 0){
                ans.append(" ");
            }
            ans.append(current);
        }
        return ans.toString().trim();
    }
}