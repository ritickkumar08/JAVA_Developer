package TCS;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SecondLargest ob = new SecondLargest();
        int secondLargest = ob.find(arr);
        System.out.println(secondLargest);
    }

    private int find(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }
}
