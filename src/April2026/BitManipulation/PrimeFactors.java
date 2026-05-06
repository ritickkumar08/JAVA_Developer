package April2026.BitManipulation;

import java.util.ArrayList;

class PrimeFactors {
    public static void main(String[] args) {
        int n = 18;

        PrimeFactors ob = new PrimeFactors();
        ArrayList<Integer> ans = ob.primeFactors(n);
        System.out.println(ans);
    }
    ArrayList<Integer> primeFactors(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        if(n % 2 == 0){
            while (n % 2 == 0){
                ans.add(2);
                n/=2;
            }
        }
        for (int i = 3; (long)i*i <= n; i++) {
            if(n%i == 0){
                while (n%i == 0){
                    ans.add(i);
                    n /= i;
                }
            }
        }
        if(n != 1) ans.add(n);
        return ans;
    }
}
