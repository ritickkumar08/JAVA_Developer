package StriverA2z.February2026.Strings;

class LargestOddNumber {
    public static void main(String[] args) {
        String num = "";
        LargestOddNumber ob = new LargestOddNumber();
        String answer = ob.largestOddNumber(num);
        System.out.println(answer);
    }
    public String largestOddNumber(String num) {
        int index = -1;

        int i;
        for (int j = num.length()-1; j >= 0 ; j--) {
            if((num.charAt(j) - '0') % 2 == 1){
                index = j;
                break;
            }
        }

        //return empty string if there is no odd number
        if(index == -1) return "";

        //remove all the leading zeros
        i = 0;
        while(num.charAt(i) == '0'){
            i++;
        }

        //return the substring which ends with odd number
        return num.substring(i, index+1);
    }
}