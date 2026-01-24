package StriverA2z.january2026.BinarySearch;

class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        SingleNonDuplicate ob = new SingleNonDuplicate();
        int number = ob.singleNonDuplicate(nums);
        System.out.println(number);
    }
    public int singleNonDuplicate1(int[] nums) {
        int unique = 0;

        for (int num : nums){
            unique ^= num;
        }
        return unique;
    }
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        //if the array size is 1 return the only element in the array
        if(n==1) return nums[0];

        //if the first element is unique return the first element
        if(nums[0] != nums[1]) return nums[0];

        //checking for the last element if it is unique
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                start = mid+1;
            }else{
                end = mid -1;
            }

        }

        return -1;
    }
}