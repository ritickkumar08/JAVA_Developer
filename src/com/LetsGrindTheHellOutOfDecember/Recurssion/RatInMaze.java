package com.LetsGrindTheHellOutOfDecember.Recurssion;
//Consider a rat placed at position (0, 0) in an n x n square matrix maze[][].
// The rat's goal is to reach the destination at position (n-1, n-1).
// The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).
//
//The matrix contains only two possible values:
//
//0: A blocked cell through which the rat cannot travel.
//1: A free cell that the rat can pass through.
//Your task is to find all possible paths the rat can take to reach the destination, starting from (0, 0) and ending at (n-1, n-1), under the condition that the rat cannot revisit any cell along the same path. Furthermore, the rat can only move to adjacent cells that are within the bounds of the matrix and not blocked.
//If no path exists, return an empty list.
//Note: Return the final result vector in lexicographically smallest order.

import java.util.ArrayList;

class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        RatInMaze ob = new RatInMaze();
        ArrayList<String> paths = ob.ratInMaze(maze);
        System.out.println(paths);
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n = maze.length;
        ArrayList<String> list = new ArrayList();
        //if the starting or end point is 0 then we cannot make a move to start or reach the point as it is unaccessible
        //so there is no way.
        if(maze[0][0] == 0 || maze[n-1][n-1] ==0 ){
            return list;
        }

        boolean[][] visited = new boolean[n][n];
        return mazePath(maze,0,0,visited);

    }

    private ArrayList<String> mazePath(int[][] maze,int Row, int Column,boolean[][] visited) {
        int n = maze.length;
        if(Row == n-1 && Column == n-1){
            ArrayList<String> baseCase = new ArrayList();
            baseCase.add("");
            return baseCase;
        }

        visited[Row][Column]  = true;
        ArrayList<String> paths = new ArrayList<>();

        //up paths
       if(isSafe(maze,Row-1,Column,visited)){
          ArrayList<String> upPaths = mazePath(maze,Row-1,Column,visited);
          for(String path : upPaths){
              paths.add("U"+path);
          }
       }
       //down paths
        if(isSafe(maze,Row+1,Column,visited)){
            ArrayList<String> downPAths = mazePath(maze,Row+1,Column,visited);
            for(String path : downPAths){
                paths.add("D"+path);
            }
        }
        //left paths
        if(isSafe(maze,Row,Column-1,visited)){
            ArrayList<String> lPaths = mazePath(maze,Row,Column-1,visited);
            for(String path : lPaths){
                paths.add("L"+path);
            }
        }
        //right paths
        if (isSafe(maze,Row,Column+1,visited)){
            ArrayList<String> rPaths = mazePath(maze,Row,Column+1,visited);
            for(String path : rPaths){
                paths.add("R"+path);
            }
        }
        visited[Row][Column]  = false;

        return paths;
    }

    private boolean isSafe(int[][] maze, int row, int column, boolean[][] visited) {
        return row >= 0 && column >= 0 && row < maze.length && column < maze.length
                && maze[row][column] == 1 && !visited[row][column];
    }
}