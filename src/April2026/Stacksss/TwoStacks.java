package April2026.Stacksss;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class TwoStacks {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
        return twoStacks(maxSum, a, b,0,0);
    }

    private static int twoStacks(int maxSum,List<Integer>a, List<Integer>b , int sum, int count ){
        if(sum > maxSum){
            return count - 1;
        }

        if(a.size() == 0 && b.size() == 0){
            return count;
        }

        if(a.size() == 0){
            return twoStacks(maxSum, a, new ArrayList<>(b.subList(1, b.size())), sum+b.get(0), count+1 );
        }

        if (b.size() == 0){
            return twoStacks(maxSum, new ArrayList<>(a.subList(1, a.size())), b, sum+a.get(0), count+1 );
        }

        int ans1 = twoStacks(maxSum, new ArrayList<>(a.subList(1, a.size())), b, sum+a.get(0), count+1 );
        int ans2 = twoStacks(maxSum, a, new ArrayList<>(b.subList(1, b.size())), sum+b.get(0), count+1 );

        return Math.max(ans1, ans2);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int maxSum = Integer.parseInt(firstMultipleInput[2]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = TwoStacks.twoStacks(maxSum, a, b);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
