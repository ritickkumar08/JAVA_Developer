package StriverA2z.january2026.Arrayss.HARD.MajorityElement;

import java.util.ArrayList;
import java.util.Collections;

class FindMajority {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,2,2};
        FindMajority ob = new FindMajority();
        ArrayList<Integer> list = ob.findMajority(nums);
        System.out.println(list);
    }
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        ArrayList<Integer> answer = new ArrayList<>();
        int n = arr.length;
        int req = (int)(Math.floor(n/3));

        if(n == 0) return answer;

        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : arr){
            if(candidate1 == num){
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : arr){
            if (num == candidate1) count1++;
            if (num == candidate2) count2++;
        }
        if(count1 > req) answer.add(candidate1);
        if(count2 > req) answer.add(candidate2);

        Collections.sort(answer);
        return answer;
    }
}