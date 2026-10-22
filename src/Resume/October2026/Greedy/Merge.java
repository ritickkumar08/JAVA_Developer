package Resume.October2026.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Merge {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {4,7},
                {1,4},
                {8,10},
                {15,18},
        };

        Merge ob = new Merge();
        int[][] answer = ob.merge(intervals);
        System.out.println(Arrays.deepToString(answer));
    }
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        List<int[]> answer = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int[] currentInterval = intervals[0];
        answer.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] nextinterval = intervals[i];

            if(currentInterval[1] >= nextinterval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], nextinterval[1]);
            }else {
                currentInterval = nextinterval;
                answer.add(currentInterval);
            }
        }

        return answer.toArray(new int[answer.size()][]);
    }
}