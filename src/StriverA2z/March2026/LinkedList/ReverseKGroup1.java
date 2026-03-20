package StriverA2z.March2026.LinkedList;

public class ReverseKGroup1 {
    public static void main(String[] args) {

    }
    public Node reverseKGroup(Node head, int k){
        if(head == null || k == 0){
            return head;
        }

        //we create a dummy node.
        Node dummy = new Node(0);
        dummy.next = head;

        //we will need the prvious group head;
        Node groupprev = dummy;

        while(true){
            Node kth = groupprev;
            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if(kth == null){
                    return dummy.next;
                }
            }

            //the start of next group
            Node nextgroup = kth.next;

            //now to reverse
            Node prev = nextgroup;
            Node curr = groupprev.next;

            while(curr != nextgroup){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node temp = groupprev.next;

            groupprev.next = kth;

            groupprev = temp;
        }
    }
}
