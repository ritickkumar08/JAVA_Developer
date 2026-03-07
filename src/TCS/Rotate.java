package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the number of rotations");
//        int k = sc.nextInt();
//        System.out.println("enter the elements");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        Rotate ob = new Rotate();
        int[] a = {1,2,3,4,5};
        int r = 2;
        int[] answer = ob.rotate(a,r);
        System.out.println(Arrays.toString(answer));
    }

    private int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        rotated(arr, 0, k);
        rotated(arr, k, n);
        rotated(arr, 0, n);

        return arr;
    }

    private void rotated(int[] arr, int start, int end) {
        int left = start;
        int right = end - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
