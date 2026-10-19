package Resume.October2026.Greedy;

import java.util.Arrays;

class MaxMeetings {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        MaxMeetings ob = new MaxMeetings();
        int ans = ob.maxMeetings(start, end);
        System.out.println(ans);
    }
    public int maxMeetings(int[] start, int[] end) {
       //your code goes here
        int n = start.length;
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = start[i];
            intervals[i][1] = end[i];
        }

        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1], b[1]));
        System.out.println(Arrays.deepToString(intervals));

        int count = 1;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if(intervals[i][0] > prevEnd){
                count++;
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }
    public int maxMeetings1(int[] start, int[] end) {
        int n = start.length;
        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }

        Arrays.sort(meetings, (a, b) -> a[1] - b[1]);
        int lastEndTime = -1;
        int count = 0;

        for (int[] meeting : meetings) {
            int currentStart = meeting[0];
            int currentEnd = meeting[1];

            if (currentStart > lastEndTime) {
                count++;
                lastEndTime = currentEnd;
            }
        }

        return count;
    }
}