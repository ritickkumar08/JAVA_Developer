package StriverA2z.March2026.LinkedList;

class Implementation {
    private Node head; //head pointer
    private Node tail; // tail pointer
    private int size; // the size of the list

    public Implementation(){
        this.size = 0;
    }

    //insertion =======================================================
    //insert at the starting point=====================================
    public void insertStart(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }
    //insert at the end point=====================================
    public void insertLast(int val){
        if(tail == null){
            insertStart(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    //=====================deletion=================================
    public int deletStart(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }

        size -= 1;
        return val;
    }

    public void deleteLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        Node current = head;
        Node prev = head;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
        tail = prev;
    }

    //printing the list============================================
    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private class Node{
        private int value; //the data
        private Node next; //reference to the next node in the chain

        //constructor creates a node without connecting it.
        public Node(int value){
            this.value = value;
        }

        //creates a node and links it immediately.
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}


class Main{
    public static void main(String[] args) {
        Implementation list = new Implementation();
        list.insertStart(10);
        list.insertStart(11);
        list.insertStart(12);
        list.insertStart(13);
        list.insertLast(20);
        list.insertLast(23);
        list.insertLast(24);
        list.deleteLast();
        list.deletStart();

        list.printList();
    }
}