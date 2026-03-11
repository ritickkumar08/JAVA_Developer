package StriverA2z.March2026.LinkedList;

public class Doubly {
    Node head;

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;

        if(head != null){
            head.prev = newNode;
        }

        head = newNode;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
