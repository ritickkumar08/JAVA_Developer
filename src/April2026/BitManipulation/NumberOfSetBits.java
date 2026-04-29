package April2026.BitManipulation;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 14;
//        int count = 0;
//
//        if((n & (n-1)) == 0){
//            System.out.println(1);
//        }else {
//            while (n > 0){
//                if(n % 2 == 1){
//                    count++;
//                }
//                n /= 2;
//            }
//            System.out.println(count);
//        }

        countBits(n);
    }

    private static void countBits(int n) {
        int count = 0;

        while (n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
}
