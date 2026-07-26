package July2026.Contests.july26;

class LargestInteger {
    public static void main(String[] args) {
        LargestInteger ob = new LargestInteger();

        int n = 3;
        int s = 20;
        int ans = ob.largestInteger(n,s);
        System.out.println(ans);
    }
    public int largestInteger(int n, int s) {
        if (s > 9 * n){
            return -1;
        }
        int num = n;
        int start = 9;
        int ans = 0;

        while (num > 0 && s > 0){
            if (s - start >= 0){
                ans = ans * 10 + start;
                s -= start;
                num--;
            }
            if (s < start){
                start = s;
            }
        }

        while (num > 0){
            ans = ans * 10;
            num--;
        }


        return ans;
    }
}