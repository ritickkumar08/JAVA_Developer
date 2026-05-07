package April2026.Stacksss;

import java.util.Stack;

public class InbuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(44);
        st.push(33);
        st.push(23);
        st.push(45);
        st.push(34);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
