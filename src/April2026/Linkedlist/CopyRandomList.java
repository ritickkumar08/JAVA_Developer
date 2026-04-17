package April2026.Linkedlist;


import java.util.HashMap;

class Node1{
    int val;
    Node1 next;
    Node1 random;
    // Constructors for Node class
    Node1() {
        // Default constructor
        this.val = 0;
        this.next = null;
        this.random = null;
    }
    //constructor where have both next and the random pointers too.
    Node1(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class CopyRandomList {
    public static void main(String[] args) {
        Node1 head = new Node1(7);
        head.next = new Node1(13);
        head.next.next = new Node1(11);
        head.next.next.next = new Node1(10);
        head.next.next.next.next = new Node1(1);
    }
    //a better approach.
    public Node1 copyRandomList(Node1 head) {
        if (head == null) return null;

        Node1 temp = head;
        // Step 1: Insert copy nodes
        while (temp != null){ //we will insert the new copy nodes in between the two nodes of the given linkedlist.
            Node1 copyNode = new Node1(temp.val);

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
        Node1 dummy = new Node1(-1);
        Node1 res = dummy;
        temp = head;

        while (temp != null){
            Node1 copy = temp.next;

            res.next = copy;
            res = copy;

            temp.next = copy.next;
            temp = temp.next;
        }

        return dummy.next;
    }




    //the brute force
    public Node1 copyRandomList1(Node1 head) {
        if (head == null) return null;
        HashMap<Node1, Node1> map = new HashMap<>(); //a hashmap where we will store the original node as the key and
        //the copy node as the value.
        Node1 temp = head; //a temporary node that points to the head node temporarily.
        while(temp != null){ //the loop just creates the new copy nodes and stores them to the map.
            map.put(temp,new Node1(temp.val));
            temp = temp.next;
        }

        temp = head;
        // Step 2: Assign next and random
        while (temp != null){
            Node1 copyNode = map.get(temp);

            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }
}