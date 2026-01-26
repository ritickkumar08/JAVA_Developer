package StriverA2z.january2026.BinarySearch.BSonAnswers;

class NthRoot {
    public static void main(String[] args) {
        int n = 6;
        int m = 0;
        NthRoot ob = new NthRoot();
        int root = ob.nthRoot(n,m);
        System.out.println(root);
    }
    public int nthRoot(int n, int m) {
        // code here
        int low = 1;
        int high = m;
        if(m == 0){
            return 0;
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            long power = 1;
            for (int i = 0; i < n; i++) {
                power *= mid;
                if (power > m) break;
            }

            if(power == m) return mid;

            if(power > high){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
}