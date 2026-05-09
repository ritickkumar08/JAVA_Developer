package Rev;

public class Prime {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n == 2) return true;
        if(n%4 == 1) return false;
        if (n%4 == 2) return false;
        if( n%4 == 3) return true;
        if (n%4 == 0) return false;
        return true;
    }
}
