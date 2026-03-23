package TCS;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5,5};
        SingleNumber ob = new SingleNumber();
        int number = ob.singleNumber(nums);
        System.out.println(number);
    }

    private int singleNumber(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int mid = left + (right - left)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];

            if(mid % 2 != 0){
                if(nums[mid] == nums[mid-1]){
                    left = mid;
                }else {
                    right = mid -1;
                }
            }else {
                if(nums[mid] == nums[mid+1]){
                    left = mid;
                }else {
                    right = mid-1;
                }
            }
        }
        return  -1;
    }
}
