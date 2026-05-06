package April2026.BitManipulation;

class ReverseExponentiation {
    public static void main(String[] args) {
        int n = 3;

        ReverseExponentiation ob = new ReverseExponentiation();
        int ans = ob.reverseExponentiation(n);
        System.out.println(ans);
    }
    public int reverseExponentiation(int n) {
        // code here
        int reverse = 0;
        int temp = n;

        while (temp != 0){
            int digit = temp%10;
            reverse = reverse*10 + digit;
            temp /= 10;
        }
//        System.out.println(reverse);

        int ans = power(n,reverse);

        return ans;
    }

    private int power(int base, int pow) {
        // Base case: anything raised to 0 is 1
        if(pow == 0) return 1;
        // Base case: anything raised to 1 is itself
        if (pow == 1) return base;

        // If 'n' is even
        if(pow%2 == 0){
            // Recursive call: square the base and halve the exponent
            return power(base*base, pow/2);
        }
        // If 'n' is odd
        // Recursive call: multiply base once and reduce exponent by 1
        return base*power(base, pow-1);
//        return 0;
    }
}
