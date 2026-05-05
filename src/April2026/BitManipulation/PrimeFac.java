package April2026.BitManipulation;

import java.util.ArrayList;

class PrimeFac {
    public static void main(String[] args) {
        int n = 31;
        PrimeFac ob = new PrimeFac();
        ArrayList<Integer> ans = primeFac(n);
        System.out.println(ans);
    }
    public static ArrayList<Integer> primeFac1(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i * i <= n; i++){
            if(n % i == 0){
                if(isPrime(i)){
                    ans.add(i);
                }
                if(n/i != i && isPrime(n/i)){
                        ans.add(n/i);
                }
            }
        }
        return ans;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n < 4) return true;
        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }

        for (int i = 5; i*i <= n ; i+= 6) {
            if(n % i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        if(n % 2 == 0){
            ans.add(2);
            while (n%2 == 0) n /= 2;
        }

        for (int i = 3; i*i <= n ; i+=2) {
            if(n % i == 0){
                ans.add(i);
                while (n%i == 0) n/=i;
            }
        }

        if(n > 1) ans.add(n);

        return ans;
    }
}