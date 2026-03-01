package StriverA2z.February2026.Strings;

//Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
//The algorithm for myAtoi(string s) is as follows:
//Whitespace: Ignore any leading whitespace (" ").
//Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
//Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the
//string is reached. If no digits were read, then the result is 0.
//Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to
//remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater
//than 231 - 1 should be rounded to 231 - 1.
class MyAtoi {
    static final int INT_MIN_VAL = Integer.MIN_VALUE;
    static final int INT_MAX_VAL = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String s ="-91283472332";
        MyAtoi ob = new MyAtoi();
        int number = ob.myAtoi(s);
        System.out.println(number);
    }
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        //handling whitespaces
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        // Handle empty string
        if (i == n) return 0;

        // Handle sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return helper(s,i,0L,sign);
    }

    private int helper(String s, int i, long number, int sign) {

        if(i >= s.length() || !Character.isDigit(s.charAt(i))){
            long result = sign * number;

            if(result <= INT_MIN_VAL) return INT_MIN_VAL;
            if(result >= INT_MAX_VAL) return INT_MAX_VAL;

            return (int)(result);
        }

        number = number * 10 + (s.charAt(i) - '0');
        long result = number * sign;

        // Clamp immediately after update
        if(result <= INT_MIN_VAL) return INT_MIN_VAL;
        if(result >= INT_MAX_VAL) return INT_MAX_VAL;

        return helper(s, i+1, number, sign);
    }
}