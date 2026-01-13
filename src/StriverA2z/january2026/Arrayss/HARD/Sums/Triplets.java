package StriverA2z.january2026.Arrayss.HARD.Sums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Triplets {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> triples = triplets(nums);
        System.out.println(triples);
    }
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> allTriples = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //we are trying to skip the duplicate for the first element.
            if(i > 0 && arr[i] == arr[i-1]) continue;

            //assigning two pointer pointing at the beginging and the last element of the array.
            int left = i + 1;
            int right = n - 1;

            //iterate through the array ranging from left to right
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                //check if the sum is equal to 0.
                if(sum == 0){
                    allTriples.add(new ArrayList<>(List.of(arr[i], arr[left], arr[right])));
                    left++;
                    right--;

                    //we will be skipping all those elements that are same as we have to return only unique triplets.
                    while(left < right && arr[left] == arr[left-1]) left++;
                    while(left < right && arr[right] == arr[right+1]) right--;
                } else if (sum < 0) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return allTriples;
    }
}
