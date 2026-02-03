package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.Arrays;

class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {2, 12, 11, 3, 26, 7};
        int k = 5;
        AggressiveCows ob = new AggressiveCows();
        int distance = ob.aggressiveCows(stalls, k);
        System.out.println(distance);
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int min = Arrays.stream(stalls).min().getAsInt();
        int max = Arrays.stream(stalls).max().getAsInt();
        int possibleAsnwer = -1;

        int low = 1;
        int high = max - min;
        Arrays.sort(stalls);

        while (low <= high){
            int mid = low + (high - low)/2;

            if(canPlaceCows(stalls, k, mid) == true){
                possibleAsnwer = mid;
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return possibleAsnwer;
    }

    private boolean canPlaceCows(int[] stalls, int cows, int distance) {
        int placed = 1;
        int last = stalls[0];
        for (int i = 0; i < stalls.length; i++) {
            if(stalls[i] - last >= distance){
                placed++;
                last = stalls[i];
            }
            if(placed >= cows) return true;
        }
        return false;
    }
}