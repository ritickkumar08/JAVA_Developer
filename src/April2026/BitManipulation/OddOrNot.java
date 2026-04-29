package April2026.BitManipulation;

public class OddOrNot {
    public static void main(String[] args) {
        int n = 14;

        OddOrNot ob = new OddOrNot();
        ob.odd(n);
    }

    private void odd(int n) {
        if((n & 1) != 0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
