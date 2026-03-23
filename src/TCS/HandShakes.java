package TCS;

import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int handshakes = (n * (n-1))/2;
            System.out.println(handshakes);
        }
    }
}
