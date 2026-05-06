package April2026.BitManipulation;

import java.util.Arrays;

class ClosestPrimes {
    public static void main(String[] args) {
        int left = 21;
        int right = 25;

        ClosestPrimes ob = new ClosestPrimes();
        int[] ans = ob.closestPrimes(left, right);
        System.out.println(Arrays.toString(ans));
    }
    public int[] closestPrimes(int left, int right) {
        if(right < 2) return new int[] {-1,-1};

        boolean[] isComposite = new boolean[right+1];

        for (int i = 2; (long)i*i <= right; i++) {
            if(!isComposite[i]){
                for (int j = i*i; j <= right; j+=i) {
                    isComposite[j] = true;
                }
            }
        }


        int[] ans = {-1, -1};
        int minDiff = Integer.MAX_VALUE;
        int prev = -1;

        for (int i = left; i <= right; i++) {
            if(i >= 2 && !isComposite[i]){
                if (prev != -1 && i - prev < minDiff){
                    minDiff = i - prev;
                    ans = new int[]{prev, i};
                }
                prev = i;
            }
        }

        return ans;
    }
}