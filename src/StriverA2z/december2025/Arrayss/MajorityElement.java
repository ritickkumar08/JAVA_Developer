package StriverA2z.december2025.Arrayss;

import java.util.HashMap;

class MajorityElement{
    public static void main(String[] args) {
        int[] nums = {2,3,1};
        MajorityElement ob = new MajorityElement();
        int num = ob.majorityElement1(nums);
        System.out.println(num);
    }
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int criteria = n / 2;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

                if(map.get(nums[i]) > criteria){
                    return nums[i];
                }

        }
        return -1;
    }
    public int majorityElement1(int[] nums) {
        int count = 0;
        int candidate = -1;

        for (int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
}