package StriverA2z.january2026.Arrayss.HARD.MajorityElement;

import java.util.*;

class MajorityElement1 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1, 3, 2, 1, 1};
        MajorityElement1 ob = new MajorityElement1();
        List<Integer> list = ob.majorityElement(nums);
        System.out.println(list);
    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int mini = (int)(Math.floor(n/3));

        for (int i = 0; i < n; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(map.get(nums[i]) == mini){
                answer.add(nums[i]);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}