package StriverA2z.March2026.LinkedList;

class Node1{
    int data;
    Node1 next;

    Node1(){};
    Node1(int data){
        this.data = data;
        this.next = null;
    };
}


class KAltReverse {
    public static void main(String[] args) {
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);
        head.next.next.next.next.next = new Node1(6);
        head.next.next.next.next.next.next = new Node1(7);
        head.next.next.next.next.next.next.next = new Node1(8);
        int k = 3;
        KAltReverse ob = new KAltReverse();
        Node1 results = ob.kAltReverse(head, k);
        Node1 temp = results;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node1 kAltReverse(Node1 head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        //Dummy node avoids headache when head changes
        Node1 curr = head;
        Node1 prev = null;
        boolean shouldReverse = true;


        while (curr != null) {

            //if the number of count is odd then only reverese.
            if (shouldReverse) {
                //now to reverse the list k or remaining nodes;
                Node1 lastNodeOfPrevPart = prev;
                Node1 lastNodeOfSubList = curr;
                int i = 0;
                while (curr != null && i < k) {
                    Node1 next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                    i++;
                }
                //to connect previous part.
                if (lastNodeOfPrevPart != null) {
                    lastNodeOfPrevPart.next = prev;
                } else {
                    head = prev;
                }
                // connect next part
                lastNodeOfSubList.next = curr;

                prev = lastNodeOfSubList;

            } else {
                // Skip k nodes
                int i = 0;
                while (curr != null && i < k) {
                    prev = curr;
                    curr = curr.next;
                    i++;
                }
            }
            shouldReverse = !shouldReverse;
        }
        return head;
    }
}
