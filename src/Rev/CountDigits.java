package Rev;

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        CountDigits ob = new CountDigits();
        int digits = countDigits(n);
        System.out.println(digits);
    }
    public static int countDigits(int n) {
        // Code here
        int count = 0;
        int x = n;

        while (x != 0){
            count++;
            x /= 10;
        }
        return count;
    }
}
