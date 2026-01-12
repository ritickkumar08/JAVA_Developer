package StriverA2z.january2026.Arrayss.HARD.MajorityElement;

class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        MajorityElement ob = new MajorityElement();
        int element = ob.majorityElement(nums);
        System.out.println(element);
    }
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int num: nums){
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