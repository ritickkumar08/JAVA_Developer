package StriverA2z.january2026.Arrayss.HARD;

import java.util.ArrayList;
import java.util.Arrays;

class FindTwoElement {
    public static void main(String[] args) {
        int[] nums = {6, 5, 8, 7, 1, 4, 1, 3, 2};
        FindTwoElement ob = new FindTwoElement();
        ArrayList<Integer> ans = ob.findTwoElement(nums);
        System.out.println(ans);
    }
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
//        ArrayList<Integer> answer = new ArrayList<>();
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        long n = arr.length;

        //calculating the sum of natural numbers rangeing 1 to n and the square sum
        long sumArr = n * (n+1)/2;
        long sumSq = n* (n+1) * (2 *n +1)/6;

        long actualSum = 0, actualSq = 0;
        for (int x : arr) {
            actualSum += x;
            actualSq +=(long) x*x;
        }

        long diff = actualSum - sumArr;
        long diffSq = actualSq - sumSq;

        long sum = diffSq/diff;

        long dup = (diff + sum) /2;
        long miss = dup - diff;

        return new ArrayList<>(Arrays.asList( (int)dup, (int)miss));
    }
}