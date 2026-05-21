package May2026.Stackssss.Implementation;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class StockSpanner {
    private Deque<int[]> stack;
    private List<Integer> prices;

    public StockSpanner() {
        stack = new LinkedList<>();
        prices = new ArrayList<>();
    }
    
    public int next1(int price) {
        prices.add(price);
        int span = 0;

        for (int i = prices.size()-2; i >= 0 ; i--) {
            if (prices.get(i) <= price){
                span++;
            }else {
                break;
            }
        }
        return span;
    }


    public int next(int price) {
        int span = 1;


        while (!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.pop()[1];
        }

        stack.push(new int[] {price, span});
        return span;
    }


    public static void main(String[] args) {
        String[] commands = {"StockSpanner", "next1", "next1", "next1", "next1", "next", "next", "next"};
        int[] values = {-1, 100, 80, 60, 70, 60, 75, 85};
        StockSpanner ob = null;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]){
                case "StockSpanner":
                    ob = new StockSpanner();
                    System.out.print("null" + " ");
                    break;
                case "next":
                    System.out.print(ob.next(values[i]) + " ");
                    break;
                case "next1":
                    System.out.print(ob.next(values[i]) + " ");
                    break;
            }
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */