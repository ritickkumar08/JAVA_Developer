package TCS;

import java.util.Arrays;

class IsSubset {
    public static void main(String[] args) {
        int[] arr1 = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] arr2 = {11, 3, 7, 1, 7};
        IsSubset ob = new IsSubset();
        boolean yes = ob.isSubset(arr1, arr2);
        System.out.println(yes);
    }
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b[i]){
                for (int j = 0; j < b.length; j++) {
                    if(b[j] != a[j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
