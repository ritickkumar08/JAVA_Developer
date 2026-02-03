package DailyProblems;

class IsTrionic {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,6};
        IsTrionic ob = new IsTrionic();
        boolean yes = ob.isTrionic(nums);
        System.out.println(yes);
    }
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n <= 3) return false;

        int i = 1;
        while(i < n && nums[i] > nums[i-1]){
            i++;
        }if(i == 1 || i==n){
            return false;
        }int p = i-1;

        while (i < n && nums[i] < nums[i-1]){
            i++;
        }if(i == p+1 || i == n){
            return false;
        }

        while (i < n && nums[i] > nums[i-1]){
            i++;
        }

        return i==n;
    }
}