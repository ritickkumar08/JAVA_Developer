package April2026.BitManipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 11;
        int b = 11;

        SwapTwoNumbers ob = new SwapTwoNumbers();
        ob.swap(a,b);
    }

    private static void swap(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
    }
}
