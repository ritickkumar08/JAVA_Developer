package StriverA2z.March2026.Kunal;

class IsHappy {
    public static void main(String[] args) {
        int n = 19;
        IsHappy ob = new IsHappy();
        boolean is = ob.isHappy(n);
        System.out.println(is);
    }
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);

        return slow == 1;
    }

    private int square(int slow) {
        int n = slow;
        int ans = 0;

        while(n > 0){
            int digit = n % 10;
            ans += digit*digit;
            n = n / 10;
        }
        return ans;
    }
}