package StriverA2z.February2026;

import java.util.Arrays;
import java.util.HashMap;

class RowAndMaximumOnes {
    public static void main(String[] args) {
        int[][] mat = {
                {0, 1},
                {0, 1},
                {0, 0},
        };
        RowAndMaximumOnes ob = new RowAndMaximumOnes();
        int[] answer = ob.rowAndMaximumOnes(mat);
        System.out.println(Arrays.toString(answer));
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int maxi = 0;
        int index = 0;

        for (int i = 0; i < row; i++) {
            int ones = 0;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    ones++;
                }
            }
            if(ones > maxi) {
                maxi = ones;
                index = i;
            }
        }

        return new int[] {index, maxi};
    }
}