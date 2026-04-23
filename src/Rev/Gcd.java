package Rev;

class Gcd {
    public static void main(String[] args) {
        int a = 20;
        int b = 28;

        int ans = gcd(a,b);
        System.out.println(ans);
    }
    public static int gcd1(int a, int b) {
        // code here
        int small = Math.min(a,b);
        for (int i = small; i > 0 ; i--) {
            if (dividesBoth(a,b,i)){
                return i;
            }
        }
        return 1;
    }
    private static boolean dividesBoth(int a, int b, int mid) {
        if(a % mid == 0 && b % mid == 0){
            return  true;
        }
        return false;
    }
    public static int gcd2(int a, int b) {
        // code here
        if(a == 0 || b == 0){
            return a== 0 ? b : a;
        }

        int maxi = Math.max(a,b);
        int mini = Math.min(a,b);
        return gcd2(maxi-mini, mini);
    }
    public static int gcd(int a, int b) {
        // code here
        if(b == 0){
            return  a;
        }
        return gcd(b, a%b);
    }
}
