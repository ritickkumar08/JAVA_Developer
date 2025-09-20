package com.SeptemberArrived.two_dimensionalArray;

import java.util.Arrays;

public class SearchInSortedMatrix {
    //search in the row provided
    private int[] binarySearch(int[][] matrix, int row ,int cStart ,int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target) return new int[] {row,mid};
            else if(matrix[row][mid] > target) cEnd = mid - 1;
            else cStart = mid + 1;
        }
        return new int[] {-1,-1};
    }


    private int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // to find the number of columns a matrix has

        //edge case :- where the number of rows is one and so it becomes a one dimensional array.
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if(rows == 1){
            return binarySearch(matrix,0,0,cols - 1, target);
        }
        //now to reduce the matrix to two rows
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //while this is true the matrix has more than two rows, and we want to reduce the matrix into a 2 - row matrix.
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target) return new int[]{mid,cMid};

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        //now that we have two rows we will now check on the different parts of the remaining matrix
        //first case is it can be on the mid-column itself.
        if(matrix[rStart][cMid] == target) return new int[] {rStart,cMid}; //if the target lies on the first row of the two
        if(matrix[rStart + 1][cMid] == target) return new int[] {rStart + 1,cMid};//if the target lies on the second row of the two.

        //search in first half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //search in second half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        //search in third half
        if(target <= matrix[rStart + 1][cMid-1]){
            return  binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        }
        //search in forth half
       else{
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,   2,   3,   4,   5,   6},
                {7,   8,   9,  10,  11,  12},
                {13, 14,  15,  16,  17,  18},
                {19, 20,  21,  22,  23,  24},
                {25, 26,  27,  28,  29,  30},
                {31, 32,  33,  34,  35,  36}
        };
        int target = 35;

        SearchInSortedMatrix ob = new SearchInSortedMatrix();
        int[] index = ob.search(matrix , target);
        System.out.println(Arrays.toString(index));
    }
}
