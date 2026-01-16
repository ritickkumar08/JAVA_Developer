package StriverA2z.january2026.Arrayss.HARD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Merge {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Merge ob = new Merge();
        int[][] merged = ob.merge(intervals);
        System.out.println(Arrays.deepToString(merged));
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][0];

        //now we will sort the given intervals array
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
//        System.out.println(Arrays.deepToString(intervals));
        List<int[]> answer = new ArrayList<>();

        int current[] = intervals[0];
        answer.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int next[] = intervals[i];

            if(next[0] <= current[1]){
                current[1] = Math.max(next[1], current[1]);
            }else {
                current = next;
                answer.add(current);
            }
        }
        return answer.toArray(new int[answer.size()][]);
    }
}