package StriverA2z.january2026.BinarySearch.BSonAnswers;

class FloorSqrt {
    public static void main(String[] args) {
        int number = 9;
        FloorSqrt ob = new FloorSqrt();
        int root = ob.floorSqrt(number);
        System.out.println(root);
    }
    int floorSqrt(int n) {
        // code here
        if(n < 2) return n;

        int start = 1, end = n/2, ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid * mid <= n) {
                ans = (int)mid;
                start = (int) mid+1;
            }else{
                end = (int) mid-1;
            }
        }
        return ans;
    }
}