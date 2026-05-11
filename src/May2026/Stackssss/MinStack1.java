package May2026.Stackssss;

import java.util.Stack;

public class MinStack1 {
    protected Stack<Long> st;
    protected long mini = Long.MAX_VALUE;

    public MinStack1() {
        this.st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()){
            mini = val;
            st.push((long)val);
        }else {
            if(val >= mini){
                st.push((long)val);
            }else {
                st.push((2L * val) - mini);
                mini = val;
            }
        }

    }

    public void pop() {
        if (st.isEmpty()){
            return;
        }
        long x = st.pop();

        if (x < mini){
            mini = 2 * mini - x;
        }
    }

    public int top() {
        if (st.isEmpty()){
            return -1;
        }
        long x = st.peek();
        if(x >= mini){
            return (int)x;
        }
        return (int)mini;
    }

    public int getMin() {
        return (int)mini;
    }
}
