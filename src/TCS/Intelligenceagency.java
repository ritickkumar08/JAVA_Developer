package TCS;

public class Intelligenceagency {
    public static void main(String[] args) {
        int n = 99;
        int r = 3;
        Intelligenceagency ob = new Intelligenceagency();
        int ways = ob.intelligence(n,r);
        System.out.println(ways);
    }

    private int intelligence(int num, int r) {
        int n = num;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n = n/10;
        }

        n = r * sum;
        sum = 0;

//        while(n >= 10){
//            while(n > 0){
//                int digit = n % 10;
//                sum += digit;
//                n = n/10;
//            }
//            n = sum;
//        }

        if(n == 0) return 0;
        return 1 + (n - 1) % 9;
    }
}
