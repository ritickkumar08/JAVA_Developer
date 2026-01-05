package StriverA2z.january2026.LinkedLists;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class InsertInMiddle {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);

        if(head == null){
            return newNode;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Insert after slow
        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}