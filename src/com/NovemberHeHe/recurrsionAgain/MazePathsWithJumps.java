package com.NovemberHeHe.recurrsionAgain;

import java.util.ArrayList;

public class MazePathsWithJumps {
    public static void main(String[] args) {
        MazePathsWithJumps ob = new MazePathsWithJumps();
        ArrayList<String> list = ob.mazePathsWithJumps(0,0,4,4);
        System.out.println(list);
        System.out.println(list.size());
    }

    private ArrayList<String> mazePathsWithJumps(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }


        ArrayList<String> paths = new ArrayList<>();
        //horizontal move
        for(int move = 1 ; move <= dc - sc ; move++){
            ArrayList<String> hpaths = mazePathsWithJumps(sr,sc+move,dr,dc);
            for(String path : hpaths){
                paths.add("h" + " " + path + " " + move);
            }
        }
        //vertical move
        for(int move = 1 ; move <= dr - sr ; move++){
            ArrayList<String> vpaths = mazePathsWithJumps(sr+move,sc,dr,dc);
            for(String path : vpaths){
                paths.add("v" + " " +path);
            }
        }
        //diagonal move
        for(int move = 1 ; move <= dr - sr && move <= dc - sc ; move++){
            ArrayList<String> dpaths = mazePathsWithJumps(sr + move,sc + move ,dr,dc);
            for(String path : dpaths){
                paths.add("d" + " " +path);
            }
        }

        return paths;
    }
}
