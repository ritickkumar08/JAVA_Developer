package May2026.Stackssss;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    protected Queue<Integer> first;
    protected Queue<Integer> second;

    public MyStack() {
        this.first = new LinkedList<>();
        this.second = new LinkedList<>();
    }
    
    public void push(int x) {
        second.add(x);

        while (!first.isEmpty()){
            second.add(first.poll());
        }

        //now swap the queues with each other
        Queue<Integer> temp = first;
        first = second;
        second = temp;
    }
    
    public int pop() {
        return first.poll();
    }
    
    public int top() {
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}