package TCS;

import java.util.Scanner;

public class MaxAqua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        MaxAqua ob = new MaxAqua();
        int count = ob.maxAqua(str,n);
        System.out.println(count);
    }

    private int maxAqua(String str, int l) {
        int i = 0;
        int maxi = -1;
        while (i < str.length()){
            int count = 0;
            for (int j = i; j < str.length() && j < i+l; j++) {
                char ch = str.charAt(j);
                if(ch == 'a'){
                    count++;
                }
            }
            maxi = Math.max(maxi, count);
            i+=l;
        }
        return maxi;
    }
}
