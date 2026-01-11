package StriverA2z.january2026.Arrayss.HARD.PascalTriangle;

public class PrintTheElement {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        PrintTheElement ob = new PrintTheElement();
        int element = ob.print(row, col);
        System.out.println(element);
    }

    private int print(int row, int col) {
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
