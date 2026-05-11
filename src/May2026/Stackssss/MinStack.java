package May2026.Stackssss;

import java.util.Stack;

class MinStack {
    protected Stack<long[]> st;

    public MinStack() {
        this.st = new Stack<>();
    }
    
    public void push(int val) {
        if (st.isEmpty()){
            st.push(new long[]{val,val});
        }
        int mini = Math.min(val, getMin());

        st.push(new long[]{val, mini});
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return (int)st.peek()[0];
    }
    
    public int getMin() {
        return (int)st.peek()[1];
    }
}