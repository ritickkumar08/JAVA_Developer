package April2026.BitManipulation;

class MinBitFlips {
    public static void main(String[] args) {
        int n = 10;
        int m = 7;

        MinBitFlips ob = new MinBitFlips();
        int bits = ob.minBitFlips(n,m);
        System.out.println(bits);
    }
    public int minBitFlips(int start, int goal) {
        int n = start ^ goal;
//        System.out.println(n);
        int bits = 0;

        while (n != 0){
            bits += n & 1;

            n = n >> 1;
        }
        return bits;
    }
}