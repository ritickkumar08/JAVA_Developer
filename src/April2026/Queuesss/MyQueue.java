package April2026.Queuesss;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        //putting the elements to the second stack so that the arrangement is reversed and the behaviour is
        //similar to a queue when popped from second stack.
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();

        //putting back the elements to the first stack
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();

        //putting back the elements to the first stack
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

class Main{

}
