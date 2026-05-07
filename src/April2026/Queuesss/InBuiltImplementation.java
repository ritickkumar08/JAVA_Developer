package April2026.Queuesss;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltImplementation {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        qu.add(10);
        qu.add(3);
        qu.add(5);
        qu.add(60);
        qu.add(7);

        System.out.println(qu.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(12);
        deque.addFirst(11);
        deque.addLast(22);

    }
}
