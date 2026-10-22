package Resume.October2026.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinGroups {
    public static void main(String[] args) {
        int[][] intervals = {
                {5,10},{6,8},{1,5},{2,3},{1,10}
        };

        MinGroups ob = new MinGroups();
        List<List<int[]>> ans = ob.minGroups(intervals);
//        System.out.println(ans);
        for (List<int[]> group : ans){
            System.out.print("[");
            for (int i = 0; i < group.size(); i++) {
                System.out.print(Arrays.toString(group.get(i)));
                if (i < group.size()){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }
    public List<List<int[]>> minGroups(int[][] intervals) {
        List<List<int[]>> answer = new ArrayList<>();
        if (intervals == null || intervals.length == 0){
            return answer;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int n = intervals.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            List<int[]> temp = new ArrayList<>();
            temp.add(intervals[i]);

            int lastEnd = intervals[i][1];

            for (int j = i+1; j < n; j++) {

                if(!visited[j] && intervals[j][0] > lastEnd){
                    temp.add(intervals[j]);
                    visited[j] = true;
                    lastEnd = intervals[i][1];
                }
            }
            answer.add(temp);
        }
        System.out.println(answer);

        return answer;
    }
}