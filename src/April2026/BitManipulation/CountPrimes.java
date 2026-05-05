package April2026.BitManipulation;

class CountPrimes {
    public static void main(String[] args) {
        int n = 10;

        CountPrimes ob = new CountPrimes();
        int primes = ob.countPrimes(n);
        System.out.println(primes);
    }
    public int countPrimes(int n) {
        if(n < 2) return 0;
        boolean[] isComposite = new boolean[n];

        for (int i = 2; i*i < n; i++) {
            if(!isComposite[i]){
                for (int j = i*i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if(!isComposite[i]) count++;
        }

        return count;
    }
}