package Rev.Strings;

class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        ReverseString ob = new ReverseString();
        ob.reverseString(s);
        System.out.println(s);
    }
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}