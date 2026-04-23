package Rev;

class Reverse {
    public static void main(String[] args) {
        int n = 200;

        Reverse ob = new Reverse();
        int reversed = ob.reverse(n);
        System.out.println(reversed);
    }

    public int reverse(int x) {
        int reversed = 0;
        int n = x;
        int digit = 0;

        while (n != 0) {
            digit = n % 10;
            n /= 10;
            if (digit != 0) {
                reversed = reversed * 10 + digit;
            }
        }
        return reversed;
    }
}