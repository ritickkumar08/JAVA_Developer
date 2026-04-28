package April2026.Linkedlist;

import java.util.ArrayList;
import java.util.List;

class OddEvenList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        OddEvenList ob = new OddEvenList();
        ListNode ans = ob.oddEvenList(head);
        ListNode curr = ans;
        while (curr != null){
            System.out.print( curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
    public ListNode oddEvenList1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        ListNode even = head.next;

        while (curr != null && curr.next != null){
            list.add(curr.data);
            curr = curr.next.next;
        }
        if(curr != null) list.add(curr.data);

        while (even != null && even.next != null){
            list.add(even.data);
            even = even.next.next;
        }
        if(even != null) list.add(even.data);

        curr = head;
        int i = 0;
        while (curr != null){
                curr.data = list.get(i);
                curr = curr.next;
                i++;
        }

        return head;
    }
}