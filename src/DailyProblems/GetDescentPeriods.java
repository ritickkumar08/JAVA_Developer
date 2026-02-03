package DailyProblems;

class GetDescentPeriods {
    public static void main(String[] args) {
        int[] prices = {3,2,1,4};
        GetDescentPeriods ob = new GetDescentPeriods();
        long periods = ob.getDescentPeriods(prices);
        System.out.println(periods);
    }
    public long getDescentPeriods(int[] prices) {
        long periods = 1;
        long current = 1;

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] == prices[i-1] - 1){
                current++;
            }else {
                current = 1;
            }
            periods += current;
        }
        return periods;
    }
}