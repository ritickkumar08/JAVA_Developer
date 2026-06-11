package June2026.TwoPointerAndSlidingWindow;

class MaxScore {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;

        MaxScore ob = new MaxScore();
        int ans = ob.maxScore(cardPoints, k);
        System.out.println(ans);
    }
    public int maxScore(int[] cardPoints, int k) {
        int lSum = 0;
        int rSum = 0;
        int maxSum;

        for (int i = 0; i < k; i++) {
            lSum += cardPoints[i];
        }
        maxSum = lSum;

        int right = cardPoints.length - 1;
        for (int i = k-1; i >= 0; i--) {
            lSum = lSum - cardPoints[i];
            rSum += cardPoints[right--];

            maxSum = Math.max(maxSum, lSum+rSum);
        }

        return maxSum;
    }
}