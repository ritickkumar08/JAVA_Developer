package StriverA2z.january2026.Arrayss.MEDIUM;

import java.util.ArrayList;

class SpirallyTraverse {
    public static void main(String[] args) {
        int[][] maty = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        SpirallyTraverse ob = new SpirallyTraverse();
        ArrayList<Integer> answer = ob.spirallyTraverse(maty);
        System.out.println(answer);
    }
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> myAnswer = new ArrayList<>();
        int row = mat.length;
        int col = mat[0].length;
        int left = 0;
        int top = 0;
        int right = col- 1;
        int bottom = row-1;
        while(left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                myAnswer.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                myAnswer.add(mat[i][right]);
            }
            right--;

            if(top <= bottom){
                for (int i = right; i >= left ; i--) {
                    myAnswer.add(mat[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for (int i = bottom; i >= top; i--) {
                    myAnswer.add(mat[i][left]);
                }
                left++;
            }
        }



        return myAnswer;
    }
}
