package Resume.November2026.Recurssion;

class MyPow {
    public static void main(String[] args) {
        double x = 2.0;
        int n = -2;

        MyPow ob = new MyPow();
        double power = ob.myPow(x, n);
        System.out.println(power);
    }
    public double myPow(double x, int n) {
        if(n == 1){
            return x;
        }
        if(n == 0){
            return 1;
        }
        if(n < 0){
            n *= -1;
        }

        return x * myPow(x, n-1);
    }
}