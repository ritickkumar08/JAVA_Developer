package Resume.October2026.Recurssion.MazeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithObstacles {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        WithObstacles ob = new WithObstacles();
        List<String> ans = ob.withObstacles(mat);
        System.out.println(ans);
    }

    public List<String> withObstacles(int[][] mat) {
        List<String> answer = new ArrayList<>();
        // Edge case: if the start is blocked or matrix is empty
        if (mat == null || mat.length == 0 || mat[0].length == 0 || mat[0][0] == 0) {
            return answer;
        }
        backTrack(mat, 0, 0, answer, new StringBuilder());
        return answer;
    }

    private void backTrack(int[][] mat, int row, int col, List<String> answer, StringBuilder current) {
        if (row <0 || col < 0 || row >= mat.length || col >= mat[0].length || mat[row][col] == 0 ){
            return;
        }

        if(row == mat.length-1 && col == mat[1].length-1){
            answer.add(current.toString());
            return;
        }


        current.append('R');
        backTrack(mat, row, col+1, answer, current);
        current.deleteCharAt(current.length()-1);
        

        current.append('D');
        backTrack(mat, row+1, col, answer, current);
        current.deleteCharAt(current.length()-1);

    }

}
