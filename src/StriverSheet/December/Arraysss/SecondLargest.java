package StriverSheet.December.Arraysss;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {12,3,45,4,6,5,7,8,6,543,2,3,5,6,78,54,3,2,3,4,56};
        SecondLargest ob = new SecondLargest();
        int sl = ob.secondLargest(nums);
        System.out.println(sl);
    }

    private int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }

        }
        return secondLargest;
    }
}
