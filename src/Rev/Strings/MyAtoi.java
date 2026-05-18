package Rev.Strings;

class MyAtoi {
    public static void main(String[] args) {
        String s = "42";

        MyAtoi ob = new MyAtoi();
        int ans = ob.myAtoi(s);
        System.out.println(ans);
    }
    static final int INT_MIN_VAL = -2147483648;
    static final int INT_MAX_VAL = 2147483647;

    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        //remove the leading blank spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return helper(s,i,0L,sign);
    }

    private int helper(String s, int i, long number, int sign) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))){
            long result = sign * number;

            if (result <= INT_MIN_VAL) return INT_MIN_VAL;
            if (result >= INT_MAX_VAL) return INT_MAX_VAL;

            return (int) (result);
        }
        number = number * 10 + (s.charAt(i) - '0');
        long result = number * sign;

        // Clamp immediately after update
        if(result <= INT_MIN_VAL) return INT_MIN_VAL;
        if(result >= INT_MAX_VAL) return INT_MAX_VAL;

        return helper(s,i+1,number,sign);
    }
}