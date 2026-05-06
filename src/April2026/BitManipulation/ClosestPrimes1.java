package April2026.BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;

class ClosestPrimes1 {
    public static void main(String[] args) {
        int left = 10;
        int right = 19;

        ClosestPrimes1 ob = new ClosestPrimes1();
        int[] ans = ob.closestPrimes(left, right);
        System.out.println(Arrays.toString(ans));
    }
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if(isPrime(i)) primes.add(i);
        }

        if(primes.size() < 2) return new int[] {-1,-1};

        int[] ans = {-1,-1};
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < primes.size()-1; i++) {
            int diff = primes.get(i + 1) - primes.get(i);
            if(diff < minDiff){
                minDiff = diff;
                ans = new int[] {primes.get(i), primes.get(i+1)};
            }
        }
        return ans;
    }
    public boolean isPrime(int n){
        if(n < 2) return false;
        if (n < 4) return true;
        if(n % 2 ==0 || n % 3 == 0) return false;

        for (int i = 5; (long)i*i <= n; i+=6) {
            if(n % i == 0 || n %(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}