package June2026.TwoPointerAndSlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class TotalFruit {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};

        TotalFruit ob = new TotalFruit();
        int ans = ob.totalFruit(fruits);
        System.out.println(ans);
    }
    //the extreme naive solution to it can be generate all the subarrays and check 
    public int totalFruit(int[] fruits) {
        int maxi = 0;

        for (int i = 0; i < fruits.length; i++) {
            int length = 0;
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < fruits.length; j++) {
                set.add(fruits[j]);
                if (set.size() == 3){
                    break;
                }
                length++;
            }
            maxi = Math.max(length,maxi);
        }
        return maxi;
    }

    //the second approach using the two pointer and sliding window concept and we will also use map data structures.
    public int totalFruit1(int[] fruits) {
        int maxi = 0;
        int left = 0; //the first pointer at index 0, the left limit.
        int right = 0; //the second pointer at the index 0 initially it will be moving and keeping track in the array
        //the right limit of the given window.
        HashMap<Integer, Integer> map = new HashMap<>(); // a map data structure to keep the value and the count or
        //frequency of the element that has appeared till now. and also we will need the size of the map to keep
        //track that the basket size don't increase more than 2.

        while (right < fruits.length){
            int length;
            //putting the fruit to the map and its count.
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            //removing the fruits because of which the map size is getting bigger than 2
            while (map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }

            //now calculating the length of the valid subarray
            length = right - left + 1;
            maxi = Math.max(length, maxi);
            right++;
        }

        return maxi;
    }
}