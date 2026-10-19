package Resume.October2026.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Insert {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{5,6},{7,8},{12,16}};
        int[] newInterval = {4,8};

        Insert ob = new Insert();
        int[][] ans = ob.insert(intervals, newInterval);
        System.out.println(Arrays.deepToString(ans));
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        List<int[]> ans = new ArrayList<>();

        while (i < n && newInterval[0] > intervals[i][1]){
            ans.add(intervals[i]);
            i++;
        }

        while (i < n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ans.add(newInterval);

        while (i<n){
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}