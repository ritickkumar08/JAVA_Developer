package Rev.Strings;

class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        FindTheDifference ob = new FindTheDifference();
        char ans = ob.findTheDifference(s, t);
        System.out.println(ans);
    }
    public char findTheDifference1(String s, String t) {
        int sumS = 0;
        for (char ch : s.toCharArray()) sumS += ch;
//        System.out.println(sumS);
        int sumT = 0;
        for (char ch : t.toCharArray()) sumT += ch;
//        System.out.println(sumT);
//        System.out.println((sumT - sumS) - '0');

        return (char)(sumT - sumS);
    }
    public char findTheDifference(String s, String t) {
        char result = 0;

        for (char ch : s.toCharArray()) result ^= ch;
        for (char ch : t.toCharArray()) result ^= ch;

        return result;
    }
}