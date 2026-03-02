package DailyProblems;

class MinSwaps {
    public static void main(String[] args) {
        int[][] mat = {{0,0,1},{1,1,0},{1,0,0}};
        MinSwaps ob = new MinSwaps();
        int ans = ob.minSwaps(mat);
        System.out.println(ans);
    }
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] trailingZeros = new int[n];

        //step to count trailing zeros.
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n-1; j >= 0; j--) {
                if(grid[i][j] == 0) count++;
                else break;
            }
            trailingZeros[i] = count;
        }

        int swaps = 0;
        
        //placing rows at correct place
        for (int i = 0; i < n; i++) {
            int target = n-1-i;
            int foundIdx = -1;

            //finding the row that satisfies
            for (int j = i; j < n; j++) {
                if (trailingZeros[j] >= target){
                    foundIdx = j;
                    break;
                }
            }

            // If no such row is found, it's impossible
            if (foundIdx == -1) return -1;

            //now swapping the row.
            int temp = trailingZeros[foundIdx];
            for (int j = foundIdx; j > i ; j--) {
                trailingZeros[j] = trailingZeros[j-1];
            }
            trailingZeros[i] = temp;

            swaps += (foundIdx-i);
        }
        return swaps;
    }
}