package TCS;

import java.util.ArrayList;
import java.util.Arrays;

class MinAnd2ndMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        MinAnd2ndMin ob = new MinAnd2ndMin();
        ArrayList<Integer> ans = ob.minAnd2ndMin(arr);
        System.out.println(ans);
    }
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }
        if(secondMin == Integer.MAX_VALUE){
            ans.add(-1);
        }else {
            ans.add(secondMin);
            ans.add(min);
        }
        return ans;
    }
}
