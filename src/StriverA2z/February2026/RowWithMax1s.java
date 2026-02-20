package StriverA2z.February2026;

class RowWithMax1s {
    public static void main(String[] args) {
        int[][] mat = {
                {0,1,1,1},
                {0,0,1,1},
                {1,1,1,1}
        };
        RowWithMax1s ob = new RowWithMax1s();
        int row = ob.rowWithMax1s(mat);
        System.out.println(row);
    }
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row = arr.length;

        int maxi = 0;
        int index = -1;

        for (int i = 0; i < row; i++) {
            int col = arr[i].length;
            int firstOneIndex = lowerBound(arr[i], col);
            int ones = col - firstOneIndex;

            if(ones > maxi){
                maxi = ones;
                index = i;
            }
        }
        return index;
    }

    private int lowerBound(int[] arr, int col) {
        int left = 0;
        int right = col-1;
        int ans = col;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == 1){
                ans = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return ans;
    }
}