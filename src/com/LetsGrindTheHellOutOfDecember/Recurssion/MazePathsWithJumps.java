package com.LetsGrindTheHellOutOfDecember.Recurssion;

import java.util.ArrayList;

public class MazePathsWithJumps {
    public static void main(String[] args) {
        MazePathsWithJumps ob = new MazePathsWithJumps();
        ArrayList<String> list = ob.mazePaths(0,0,4,4);
        System.out.println(list);
        System.out.println(list.size());
    }

    private ArrayList<String> mazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList baseCase = new ArrayList();
            baseCase.add("");
            return baseCase;
        }

        ArrayList<String> paths = new ArrayList<>();

        for (int steps = 1; steps <= dc - sc; steps++) {
            ArrayList<String> hpaths = mazePaths(sr,sc+steps,dr,dc);
            for(String path : hpaths){
                paths.add("h" + " " + steps + " " + path );
            }
        }
        for (int steps = 1; steps <= dr-sr; steps++) {
            ArrayList<String> vpaths = mazePaths(sr+steps,sc,dr,dc);
            for(String path : vpaths){
                paths.add("v" +  " " + steps + " " + path );
            }
        }
        for (int steps = 1; steps <= dr - sr && steps <= dc - sc; steps++) {
            ArrayList<String> dpaths = mazePaths(sr+steps,sc+steps,dr,dc);
            for (String path : dpaths){
                paths.add("d" +  " " + steps + " " + path );
            }
        }


        return paths;
    }
}
