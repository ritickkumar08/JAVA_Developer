package com.LetsGrindTheHellOutOfDecember.Recurssion;

import java.util.ArrayList;

public class BetterRatInMaze {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        BetterRatInMaze ob = new BetterRatInMaze();
        ArrayList<String> paths = ob.ratInMaze(maze);
        System.out.println(paths);
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        int n = maze.length;
        //if the starting or end point is 0 then we cannot make a move to start or reach the point as it is unaccessible
        //so there is no way.
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return result;
        }

        boolean[][] visited = new boolean[n][n];
        mazePath(0, 0, maze, n, visited, new StringBuilder(), result);

        return result;
    }

    private void mazePath(int r, int c, int[][] maze, int n, boolean[][] visited, StringBuilder path,
                          ArrayList<String> result) {

        // reached destination base case
        if(r == n-1 && c == n-1){
            result.add(path.toString());
            return;
        }

        visited[r][c]  = true;

        //down paths
        if(isSafe(maze,r+1,c,visited,n)){
            path.append("D");
            mazePath(r + 1, c, maze, n, visited, path, result);
            path.deleteCharAt(path.length() - 1);
        }
        //left paths
        if(isSafe(maze,r,c-1,visited,n)){
            path.append("L");
            mazePath(r, c - 1, maze, n, visited, path, result);
            path.deleteCharAt(path.length() - 1);
        }

        //right paths
        if (isSafe(maze,r,c+1,visited,n)){
            path.append("R");
            mazePath(r, c + 1, maze, n, visited, path, result);
            path.deleteCharAt(path.length() - 1);
        }
        //up paths
        if(isSafe(maze,r-1,c,visited,n)){
            path.append("U");
            mazePath(r - 1, c, maze, n, visited, path, result);
            path.deleteCharAt(path.length() - 1);
        }

        visited[r][c]  = false;
    }

    private boolean isSafe(int[][] maze, int row, int column, boolean[][] visited,int n) {
        return row >= 0 && column >= 0 && row < maze.length && column < maze.length
                && maze[row][column] == 1 && !visited[row][column];
    }
}
