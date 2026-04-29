package April2026.BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;

        ClearBit ob = new ClearBit();
        ob.clearBit(n,k);
    }

    private void clearBit(int n, int k) {

        int ans = n & (~(1 << k));
        System.out.println(ans);
    }
}
