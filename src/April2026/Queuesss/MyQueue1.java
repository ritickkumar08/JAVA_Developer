package April2026.Queuesss;

import java.util.Stack;

public class MyQueue1 {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue1(){
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void push(int x){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(x);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int pop(){
        return first.pop();
    }
    public int peek(){
        return first.peek();
    }
    public boolean empty(){
        return first.isEmpty();
    }
}
