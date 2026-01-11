package StriverA2z.january2026.Arrayss.HARD.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

class GetRow {
    public static void main(String[] args) {
        int rowIndex = 3;
        GetRow ob = new GetRow();
        List<Integer> row = ob.getRow(rowIndex);
        System.out.println(row);
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = i-1; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j-1));
            }
        }
        return list;
    }
    public List<Integer> getRow1(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= rowIndex; i++) {
            int element = 0;
            element = gen(rowIndex, i);
            list.add(element);
        }

        return list;
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