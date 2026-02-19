package StriverA2z.February2026;

class KthElement {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        KthElement ob = new KthElement();
        int element = ob.kthElement(arr1, arr2, k);
        System.out.println(element);
    }
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        int t = 0;
        int[] temp = new int[n+m];

        while(i < n && j < m){
            if(a[i] < b[j]){
                temp[t] = a[i++];
                if(t+1 == k){
                    return temp[t];
                }
                t++;
            }else {
                temp[t] = b[j++];
                if(t+1 == k){
                    return temp[t];
                }
                t++;
            }
        }
        while (i < n){
            temp[t] = a[i++];
            if(t+1 == k){
                return temp[t];
            }
            t++;
        }
        while (j < m){
            temp[t] = b[j++];
            if(t+1 == k){
                return temp[t];
            }
            t++;
        }

        return -1;
    }
}