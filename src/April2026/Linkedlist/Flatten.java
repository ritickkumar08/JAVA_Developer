package April2026.Linkedlist;


import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data;
    Node bottom;
    Node next;

    Node(int data){
        this.data = data;
        this.bottom = null;
        this.next = null;
    }
}
class Flatten {
    public static void main(String[] args) {

    }

    public Node flatten(Node root) {
        if(root == null || root.next == null){
            return root;
        }
        // code here
        root.next = flatten(root.next);

        root = merge(root, root.next);

        return root;
    }
    Node merge(Node a, Node b){
        Node dummy = new Node(-1);
        Node curr = dummy;

        while (a != null && b != null){
            if(a.data < b.data){
                curr.bottom = a;
                a = a.bottom;
            }else {
                curr.bottom = b;
                b = b.bottom;
            }
            curr = curr.bottom;
        }
        if (a != null) curr.bottom = a;
        else curr.bottom = b;

        return dummy.bottom;
    }


    public Node flatten1(Node root) {
        if(root == null || root.next == null){
            return root;
        }
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = root;

        // Collect all values
        while (temp != null){
            Node t1 = temp;
            while (t1 != null){
                list.add(t1.data);
                t1 = t1.bottom;
            }
            temp = temp.next;
        }

        // Sort values
        Collections.sort(list);

//        Node dummy = new Node(-1);
        Node head = new Node(list.get(0));
        temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.bottom = new Node(list.get(i));
            temp = temp.bottom; // move pointer
        }

        return head;
    }
}