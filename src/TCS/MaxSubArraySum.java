package TCS;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        MaxSubArraySum ob = new MaxSubArraySum();
        int sum = ob.maxSum(arr, k);
        System.out.println(sum);
    }

    private int maxSum(int[] arr, int k) {
        int n = arr.length;

        int ans = 0;
        int sum = 0;

//        char c = 'A';
//        c++;
//        System.out.println(c);

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(i >= k){
                sum -= arr[i-k];
            }

            if(i >= k-1){
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}
