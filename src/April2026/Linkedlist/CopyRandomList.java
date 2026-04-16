package April2026.Linkedlist;


import java.util.HashMap;

class Node{
    int val;
    Node next;
    Node random;
    // Constructors for Node class
    Node() {
        // Default constructor
        this.val = 0;
        this.next = null;
        this.random = null;
    }
    //constructor where have both next and the random pointers too.
    Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class CopyRandomList {
    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);
    }
    //a better approach.
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node temp = head;
        // Step 1: Insert copy nodes
        while (temp != null){ //we will insert the new copy nodes in between the two nodes of the given linkedlist.
            Node copyNode = new Node(temp.val);

            copyNode.next = temp.next;
            temp.next = copyNode;

            temp = temp.next.next;
        }

        // Step 2: Set random pointers
        temp = head;
        while (temp != null){

            if (temp.random != null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // Step 3: Separate lists
        //assigning the next values, and we have the random first because if we point to the next first the link
        //to the next node would have been lost.
        Node dummy = new Node(-1);
        Node res = dummy;
        temp = head;

        while (temp != null){
            Node copy = temp.next;

            res.next = copy;
            res = copy;

            temp.next = copy.next;
            temp = temp.next;
        }

        return dummy.next;
    }




    //the brute force
    public Node copyRandomList1(Node head) {
        if (head == null) return null;
        HashMap<Node, Node> map = new HashMap<>(); //a hashmap where we will store the original node as the key and
        //the copy node as the value.
        Node temp = head; //a temporary node that points to the head node temporarily.
        while(temp != null){ //the loop just creates the new copy nodes and stores them to the map.
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        // Step 2: Assign next and random
        while (temp != null){
            Node copyNode = map.get(temp);

            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }
}