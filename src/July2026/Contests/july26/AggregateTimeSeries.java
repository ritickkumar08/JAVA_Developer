package July2026.Contests.july26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class AggregateTimeSeries {
    public static void main(String[] args) {
        int[][] series1= {{1,3}, {4,1}};
        int[][] series2= {{2,2}, {5,2}};

        AggregateTimeSeries ob = new AggregateTimeSeries();
        List<List<Integer>> ans = ob.aggregateTimeSeries(series1, series2);
        System.out.println(ans);
    }
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = series1.length, m = series2.length;
        int i = n-1, j = m-1;

        int value1 = 0, value2 = 0;

        while (i >= 0 || j >= 0 ){
            int timeStamp;

            if (j < 0 || (i >= 0 && series1[i][0] > series2[j][0])){
                timeStamp = series1[i][0];
                value1 = series1[i][1];
                i--;
            } else if (i < 0 || ( j >= 0 && series1[i][0] < series2[j][0] )) {
                timeStamp = series2[j][0];
                value2 = series2[j][1];
                j--;
            }else {
                timeStamp = series1[i][0];
                value1 = series1[i][1];
                value2 = series2[j][1];
                i--;
                j--;
            }
            ans.add(new ArrayList<>(Arrays.asList(timeStamp, value1+value2)));
        }

        Collections.reverse(ans);
        return ans;
    }
}