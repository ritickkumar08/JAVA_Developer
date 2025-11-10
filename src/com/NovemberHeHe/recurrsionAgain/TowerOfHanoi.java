package com.NovemberHeHe.recurrsionAgain;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        int from = 10;
        int to = 20;
        int aux = 30;
        TowerOfHanoi ob = new TowerOfHanoi();
        System.out.println(ob.towerOfHanoi(n, from, to, aux));
    }
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n == 0){
            return 0;
        }
//        int count = 0;
//        count++;
        int move1 = towerOfHanoi(n-1, from, aux, to); // we believe that this line knows how to work for n-1 disks,
        // and also follows rules that are mentioned.
//        System.out.println(n + " "+ (from + "to" + to));
        int move2 = 1;
        int move3 = towerOfHanoi(n-1, aux, to, from);// then this knows how to work with n - 1 disks alongside following
        //the mentioned rules.


        return move1 + move2 + move3;
    }
}
