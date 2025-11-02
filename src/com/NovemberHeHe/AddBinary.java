package com.NovemberHeHe;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int carry = 0;

        while(lenA >= 0 || lenB >= 0 || carry > 0){
            int sum = carry; //we are initialising it as carry because after the last operation if there is any value
            //that is 1 or 0 to be appended at the last of the result string.

            if(lenA >= 0) sum += a.charAt(lenA--) - '0'; //0 is being substracted so that we get the actual numeric value
            //rather than the unicode values.
            if(lenB >= 0) sum += b.charAt(lenB--) - '0';// we are checking the lengths of both the strings because ,
            //any one can be of a larger length.

            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        AddBinary ob = new AddBinary();
        String result = ob.addBinary(a,b);
        System.out.println(result);
    }
}
