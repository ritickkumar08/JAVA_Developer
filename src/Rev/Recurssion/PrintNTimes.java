package Rev.Recurssion;

public class PrintNTimes {
    public static void main(String[] args) {
        PrintNTimes ob = new PrintNTimes();
        ob.printNTimes(5);
    }

    private void printNTimes(int n) {
        if(n == 0){
            return;
        }
        System.out.println("hello i am " + n);
        printNTimes(n-1);
    }
}
