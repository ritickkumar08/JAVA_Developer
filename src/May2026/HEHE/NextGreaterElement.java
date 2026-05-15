package May2026.HEHE;

class NextGreaterElement {
    public static void main(String[] args) {
        int n = 2147483486;

        NextGreaterElement ob = new NextGreaterElement();
        int ans = ob.nextGreaterElement(n);
        System.out.println(ans);
    }
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int len = digits.length;

        // Step 1: find rightmost digit that is smaller than its next digit
        int i = len-2;
        while (i >= 0 && digits[i] >= digits[i+1]){
            i--;
        }
        // no such digit found → digits are in descending order → no next permutation
        if (i < 0) return -1;

        // Step 2: find rightmost digit greater than digits[i]
        int j = len -1;
        while (digits[j] <= digits[i]){
            j--;
        }

        // Step 3: swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: reverse suffix after index i
        int left = i+1, right = len-1;
        while (left < right){
            char t = digits[left];
            digits[left] = digits[right];
            digits[right] = t;
            left++;
            right--;
        }

        // Step 5: check if fits in 32-bit integer
        long result = Long.parseLong(new String(digits));
        return result > Integer.MAX_VALUE ? -1 : (int)result;
    }
}