package StriverA2z.january2026.Arrayss.HARD.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

class Generate {
    public static void main(String[] args) {
        int numberRow = 30;
        Generate ob = new Generate();
        List<List<Integer>> answerList = ob.generate(numberRow);
        System.out.println(answerList);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            int element;
            for (int j = 1; j <= i; j++) {
                element = gen(i,j);
                list.add(element);
            }
            myList.add(list);
        }
        return myList;
    }

    private int gen(int row, int col) {
        int n = row-1;
        int k = col-1;

        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n-i);
            result /= (i+1);
        }

        return result;
    }
}