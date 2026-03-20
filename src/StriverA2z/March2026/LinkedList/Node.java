package StriverA2z.March2026.LinkedList;

public class Node {
    int data;
    Node next;

    Node(){};
    Node(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
