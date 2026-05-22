package May2026.Stackssss.Implementation;

import java.util.Arrays;

class Celebrity {
    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 1, 0},
                        {0, 1, 0},
                        {0, 1, 1}
                };

        Celebrity ob = new Celebrity();
        int ans = ob.celebrity(mat);
        System.out.println(ans);
    }
    public int celebrity1(int mat[][]) {
        int n = mat.length;
        int[] knowsMe = new int[n];
        int[] Iknow = new int[n];
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1){
                    Iknow[i] ++;
                    knowsMe[j] ++;
                }
            }
        }
        System.out.println(Arrays.toString(Iknow));
        System.out.println(Arrays.toString(knowsMe));

        for (int i = 0; i < n; i++) {
            if ((knowsMe[i] == n) && (Iknow[i] == 1)){
                return i;
            }
        }
        return -1;
    }

    public int celebrity(int mat[][]) {
        int n = mat.length;
        int top = 0;
        int botom = n-1;

        //here we are trying to element the person who knows anybody because if he knows anyone
        //that implies he will surely not be a celebrity.
        while (top < botom){
            //if top knows bottom he will not be a celebrity and so we will not consider him any further.
            if (mat[top][botom] == 1) top++;
            //if the botom knows the top then he also can't be a celebirity so leave him
            else if (mat[botom][top] == 1) botom--;
            //if they both don't know each other that means they both can't be a celebrity
            //because celebrity is known by everyone.
            else {
                top++;
                botom--;
            }
        }
        //if the botom has crossed the top then there is no celebrity;
        if (botom > top) return -1;

        //now we check if the person is known by everyone and knows none but himself.
        for (int i = 0; i < n; i++) {
            if (i == top) continue;
            if (mat[top][i] == 1 || mat[i][top] == 0){
                return -1;
            }
        }

        return top;
    }
}