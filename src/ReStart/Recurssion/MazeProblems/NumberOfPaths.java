package ReStart.Recurssion.MazeProblems;

import java.util.ArrayList;

public class NumberOfPaths {
    public static void main(String[] args) {
        int n = 3;
        NumberOfPaths ob = new NumberOfPaths();
        int paths = ob.numberofPaths(n);
        ArrayList<String> pathsname = ob.path(n,n);
        System.out.println(pathsname );

        System.out.println(paths);
    }

    public int numberofPaths(int n) {
         return numberofPaths(n, n);
    }
    private int numberofPaths(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = numberofPaths(row -1, col);
        int right = numberofPaths(row, col-1);

        return left + right;
    }

    public ArrayList<String> path(int row, int col){
        ArrayList<String> answer = new ArrayList<>();
        path(answer, new StringBuilder(), row, col);
        return answer;
    }
    private void path(ArrayList<String> answer, StringBuilder current , int row, int col){
        if(row == 1 && col == 1){
            answer.add(current.toString());
            return;
        }
        if(row > 1){
            current.append('D');
            path(answer, current, row-1, col);
            current.deleteCharAt(current.length()-1);
        }
        if(col > 1){
            current.append('R');
            path(answer, current, row, col-1);
            current.deleteCharAt(current.length()-1);
        }
        if(row > 1 && col > 1){
            current.append('I');
            path(answer, current, row-1, col-1);
            current.deleteCharAt(current.length()-1);
        }
    }
}
