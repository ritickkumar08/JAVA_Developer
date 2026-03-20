package StriverA2z.March2026.LinkedList;

class RotateRight {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RotateRight ob = new RotateRight();
        ListNode result = ob.rotateRight(head, 2);
        ListNode temp = result;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
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
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}