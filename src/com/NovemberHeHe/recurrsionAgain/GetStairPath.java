package com.NovemberHeHe.recurrsionAgain;

import java.util.ArrayList;

public class GetStairPath {
    public static void main(String[] args) {
        int n = 4;
        GetStairPath ob = new GetStairPath();
        ArrayList<String> list = ob.getStairsPath(n);
        System.out.println(list);
    }

    private ArrayList<String> getStairsPath(int n) {
        if(n == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }else if (n < 0){
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult;
        }

        ArrayList<String> pathsWith1 = getStairsPath(n-1);
        ArrayList<String> pathsWith2 = getStairsPath(n-2);
        ArrayList<String> pathsWith3 = getStairsPath(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : pathsWith1){
            paths.add(1 + path);
        }
        for (String path : pathsWith2){
            paths.add(2 + path);
        }
        for (String path : pathsWith3){
            paths.add(3  + path);
        }

        return paths;
    }

}
