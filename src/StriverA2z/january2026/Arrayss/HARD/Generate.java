package StriverA2z.january2026.Arrayss.HARD;

import java.util.ArrayList;
import java.util.List;

class Generate {
    public static void main(String[] args) {
        int numberRow = 2;
        Generate ob = new Generate();
        List<List<Integer>> answerList = ob.generate(numberRow);
        System.out.println(answerList);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = numRows;
        if(n == 1){
            list.add(1);
            myList.add(list);
        }
        if (n == 2){
            list.add(1);
            myList.add(list);
            list.add(1,1);
            myList.add(list);
        }
        return myList;
    }
}