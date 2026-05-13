package Rev.Strings;

class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        
        LengthOfLastWord ob = new LengthOfLastWord();
        int ans = ob.lengthOfLastWord(s);
        System.out.println(ans);
    }
    public int lengthOfLastWord1(String s) {
        int count = 0;
        s = s.trim();
        System.out.println(s.length());

        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' '){
                break;
            }
            count++;
        }
        return count;
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
//        System.out.println(s.length());


        return str[str.length -1].length();
    }
}