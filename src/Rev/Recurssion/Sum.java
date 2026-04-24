package Rev.Recurssion;

public class Sum {
    public static void main(String[] args) {
        Sum ob = new Sum();
        int sum = ob.sum(5);
        System.out.println(sum);
    }

    private int sum(int i) {
        if(i == 1) return 1;

        return i + sum(i-1);
    }
}
