package April2026.BitManipulation;

import java.util.ArrayList;
import java.util.Collections;

class GetDivisors {
    public static void main(String[] args) {
        int n = 20;

        GetDivisors ob = new GetDivisors();
        ArrayList<Integer> ans = ob.getDivisors(n);
        System.out.println(ans);
    }
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i*i <= n; i++) {
            if(n % i == 0){
                ans.add(i);
                if(n/i != i){
                    ans.add(n/i);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}