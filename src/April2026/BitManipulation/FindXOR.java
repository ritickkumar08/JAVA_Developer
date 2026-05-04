package April2026.BitManipulation;

class FindXOR {
    public static void main(String[] args) {
        int l = 4;
        int r = 8;

        FindXOR ob = new FindXOR();
        int ans = findXOR(l,r);
        System.out.println(ans);
    }
    public static int findXOR1(int l, int r) {
        // code here
        int ans = 0;
        for (int i = l; i <= r; i++) {
            ans ^= i;
        }
        return ans;
    }
    public static int findXOR(int l, int r) {
        // code here
        return xorTillN(l-1) - xorTillN(r);
    }

    private static int xorTillN(int n) {
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n + 1;
        if(n % 4 == 3) return 0;
        return n;
    }
}