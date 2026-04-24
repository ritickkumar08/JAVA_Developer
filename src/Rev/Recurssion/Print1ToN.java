package Rev.Recurssion;

public class Print1ToN {
    public static void main(String[] args) {
        Print1ToN ob = new Print1ToN();
        ob.print1ToN(5);
    }

    private void print1ToN(int i) {
        if(i == 0) return;

        print1ToN(i-1);
        System.out.println(i);
    }
}
