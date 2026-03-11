package StriverA2z.March2026.LinkedList;

public class LL {
    private Node head;

    public void insertFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private class Node{
        int data;
        Node next;

        //creates a node without connecting it to the next node
        public Node(int data){
            this.data = data;
        }

        //creates a node and connects to the next.
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);

        list.printList();
    }
}
