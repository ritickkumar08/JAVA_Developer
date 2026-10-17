package ReStart.Recurssion.MazeProblems;

import java.util.ArrayList;

class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        RatInMaze ob = new RatInMaze();
        ArrayList<String> ans = ob.ratInMaze(maze);
        System.out.println(ans);
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> answer = new ArrayList<>();
        int m = maze.length;
        int n = maze[0].length;

        if(maze == null || maze[0][0] == 0 || m == 0 || n == 0 || maze[m-1][n-1] == 0) return answer;
        backTrack(maze, 0, 0, m, n, answer, new StringBuilder());
        return answer;
    }

    private void backTrack(int[][] maze, int row, int col, int m, int n, ArrayList<String> answer, StringBuilder current) {
        if(row == m-1 && col == n-1){
            answer.add(current.toString());
            return;
        }

        int temp = maze[row][col];
        maze[row][col] = 0;

        if(row+1 < m && maze[row+1][col] != 0){
            current.append('D');
            backTrack(maze,row+1, col, m, n, answer, current);
            current.deleteCharAt(current.length()-1);
        }
        if(col+1 < n && maze[row][col+1] != 0){
            current.append('R');
            backTrack(maze,row, col+1, m, n, answer, current);
            current.deleteCharAt(current.length()-1);
        }
        if(row-1 >= 0 && maze[row-1][col] != 0){
            current.append('U');
            backTrack(maze,row-1, col, m, n, answer, current);
            current.deleteCharAt(current.length()-1);
        }
        if(col-1 >= 0 && maze[row][col-1] != 0){
            current.append('L');
            backTrack(maze,row, col-1, m, n, answer, current);
            current.deleteCharAt(current.length()-1);
        }

        maze[row][col] = temp;
    }
}