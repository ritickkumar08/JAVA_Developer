package April2026.Linkedlist;

class ListNode{
    int data;
    ListNode next;

    ListNode(){}
    ListNode(int data){
        this.data = data;
    }
    ListNode(int data, ListNode next){
        this.data = data;
        this.next = next;
    }
}


class RotateRight {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;

        RotateRight ob = new RotateRight();
        ListNode newHead = ob.rotateRight(head,k);
        ListNode curr = newHead;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }


        int length = 1;
        ListNode last = head;
        while (last.next != null){
            last = last.next;
            length++;
        }

        last.next = head;
        k = k % length;
        int skip = length - k;
        ListNode newLast = head;
        for (int i = 0; i < skip-1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}