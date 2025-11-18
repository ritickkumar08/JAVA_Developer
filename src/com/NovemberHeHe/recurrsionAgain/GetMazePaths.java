package com.NovemberHeHe.recurrsionAgain;

import java.util.ArrayList;

public class GetMazePaths {
    public static void main(String[] args) {
        int sourceRow = 0;
        int sourceColumn = 0;
        int destinationRow = 3;
        int destinationColumn = 3;

        GetMazePaths ob = new GetMazePaths();
        ArrayList<String> paths = ob.getMazePaths(sourceRow, sourceColumn, destinationRow, destinationColumn);
        System.out.println(paths);
    }
    public ArrayList<String> getMazePaths(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn){
        if(sourceRow == destinationRow && sourceColumn == destinationColumn){
            ArrayList baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }
        ArrayList<String> restOfPathRow = new ArrayList<>();
        ArrayList<String> restOfPathColumn = new ArrayList<>();

        if(sourceRow < destinationRow){
            restOfPathRow = getMazePaths(sourceRow + 1,sourceColumn,destinationRow,destinationColumn);
        }
        if(sourceColumn < destinationColumn){
            restOfPathColumn = getMazePaths(sourceRow,sourceColumn + 1,destinationRow,destinationColumn);
        }
        ArrayList<String> paths = new ArrayList<>();

        for(String Rpath : restOfPathRow){
            paths.add("r"+ " " + Rpath);
        }
        for(String Cpath : restOfPathColumn){
            paths.add("c"+ " " + Cpath);
        }

        return paths;
    }
}
