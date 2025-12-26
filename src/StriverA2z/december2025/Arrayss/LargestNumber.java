package StriverA2z.december2025.Arrayss;

import java.util.Arrays;

class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,45,2,45,4,33,4,9};
        LargestNumber ob = new LargestNumber();
        String largest = ob.largestNumber(nums);
        System.out.println(largest);
    }
    public String largestNumber(int[] nums) {

        String[] number = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            number[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(number, (a,b) -> (b + a).compareTo(a + b));
        //here we are sorting on the basis of which element gives a bigger sum
        //that is let a = 9 , b = 10 so b+a = 109 and a + b  = 910
        // so 9 will give a greater value.

        if(number[0].equals('0') ){
            return "0"; // if the greatest number is 0 return "0"
        }

        //as we have to return a string rather than a String array so first we make a string builder and then convert it
        //to a String
        StringBuilder largest = new StringBuilder();
        for(String s : number){
            largest.append(s);
        }

        return largest.toString();
    }
}