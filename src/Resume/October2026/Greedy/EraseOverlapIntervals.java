package Resume.October2026.Greedy;

import java.util.Arrays;

class EraseOverlapIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,2},
                {2,3},
                {3,4},
                {1,3}
        };

        int[][] intervals1 = {
                {1,2},
                {1,2},
                {1,2}
        };

        EraseOverlapIntervals ob = new EraseOverlapIntervals();
        int ans = ob.eraseOverlapIntervals(intervals1);
        System.out.println(ans);
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int n = intervals.length;
        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < prevEnd){
                count++;
            }else {
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }
}