package ReStart.Recurssion.MazeProblems;

import java.util.Arrays;

class JobScheduling {
    public static void main(String[] args) {
        int[][] jobs = {
                {1, 4, 20} , {2, 1, 10} , {3, 1, 40} , {4, 1, 30}
        };
        JobScheduling ob = new JobScheduling();
        int [] ans = ob.jobScheduling(jobs);

        System.out.println(Arrays.toString(ans));
    }
    public int[] jobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs, (a, b) -> Integer.compare(b[2],a[2]));
        int n = Jobs.length;
        int maxDeadline = 0;

        for(int i = 0; i < n; i++){
            maxDeadline = Math.max(maxDeadline, Jobs[i][1]);
        }

        int[] slots = new int[maxDeadline+1];
        Arrays.fill(slots, -1);

        int countJobs = 0;
        int maxValue = 0;

        for(int i = 0; i < n; i++){
            int jobId = Jobs[i][0];
            int deadline = Jobs[i][1];
            int value = Jobs[i][2];

            for(int j = Math.min(maxDeadline, deadline); j>0; j--){
                if(slots[j] == -1){
                    slots[j] = jobId;
                    countJobs++;
                    maxValue += value;
                    break;
                }
            }
        }
        return new int[]{countJobs, maxValue};
    }
}