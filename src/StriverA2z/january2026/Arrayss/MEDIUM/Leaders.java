package StriverA2z.january2026.Arrayss.MEDIUM;

import java.util.ArrayList;
import java.util.Collections;

class Leaders {
    public static void main(String[] args) {
        int[] nums = {16,17,3,4,5,2};
        Leaders ob = new Leaders();
        ArrayList<Integer> list = leaders(nums);
        System.out.println(list);
    }
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int leader = arr[n-1];
        leaders.add(leader);

        for (int i = n-1; i >= 0; i--) {
            if(arr[i] > leader){
                leader = arr[i];
                leaders.add(arr[i]);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

}
