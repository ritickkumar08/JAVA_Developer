package April2026.BitManipulation;

public class LastBit {
    public static void main(String[] args) {
        int n = 40;

        LastBit ob = new LastBit();
        ob.lastBit(n);
    }

    private void lastBit(int n) {

        int num = (n & (n-1));
        System.out.println(num);
    }
}
