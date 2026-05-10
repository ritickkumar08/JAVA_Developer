package May2026.Queuesss;

import java.util.Stack;

class MyQueue {
    protected Stack<Integer> first;
    protected Stack<Integer> second;

    public MyQueue() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }
    
    public void push(int x) {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(x);

        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    
    public int pop() {
        if(first.isEmpty()){
            return -1;
        }
        int removed = first.pop();
        return removed;
    }
    
    public int peek() {
        if(first.isEmpty()){
            return -1;
        }
        int peeked = first.peek();
        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}
