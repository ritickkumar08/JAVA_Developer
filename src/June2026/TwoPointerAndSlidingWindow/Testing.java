package June2026.TwoPointerAndSlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        String s = "ABAB";

        Testing ob = new Testing();
        ob.totalFruit(arr);
//        ob.totalFruit1(s);
    }
    public void totalFruit(int[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < fruits.length; j++) {
                sb.append(fruits[j]).append(" ");
                System.out.println(sb);
            }
            System.out.println();
        }
    }
//    public void totalFruit1(String fruits) {
//        for (int i = 0; i < fruits.length(); i++) {
//            for (int j = i+1; j <= fruits.length(); j++) {
//                System.out.println(fruits.substring(i,j));
//            }
//            System.out.println();
//        }
//    }
}
