package com.August;

import java.util.Arrays;

public class CyclicSort {
   //the cyclic sort can only be used to sort an array in ascending order.it checks if the element is at its correct index
    //or not that is the element - 1 is the correct index for an element.
    //it works only if the elements are in a range of 1 to n
    private int[] sortAscending(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;//we are trying to find the correct index of the element present at the index i.
            if(arr[i] != arr[correct]){//checking if the element is at the correct index,if the number is index + 1
                //then it is at its correct index and if not then its at wrong place
                swap(arr,i,correct);//we swap if the element is not at its index
            }else{
                i++;//if the element happens to be at the correct index we check for the next index
            }
        }
        return arr;
    }
    private void swap(int[] arr,int first,int second){//swapping algorithm
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

       CyclicSort ob = new CyclicSort();
       int[] sorted = ob.sortAscending(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
