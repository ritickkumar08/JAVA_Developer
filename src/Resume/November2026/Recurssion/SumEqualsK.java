package Resume.November2026.Recurssion;

import java.util.ArrayList;
import java.util.List;

public class SumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 3;

        SumEqualsK ob = new SumEqualsK();
        List<List<Integer>> answer = ob.sumEqualsK(arr, k);
        System.out.println(answer);
    }

    private List<List<Integer>> sumEqualsK(int[] arr, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        if(arr.length == 0){
            return answer;
        }

        helper(0, answer, new ArrayList<>(), k, arr);
        return answer;
    }

    private void helper(int start, List<List<Integer>> answer, ArrayList<Integer> current, int target, int[] arr) {
        if(start == arr.length){
            if(target == 0){
                answer.add(new ArrayList<>(current));
            }
            return;
        }
//        if(target < 0){
//            return;
//        }
        current.add(arr[start]);
        helper(start+1, answer, current, target-arr[start],arr);
        current.remove(current.size()-1);

        helper(start+1, answer, current, target,arr);
    }
}
