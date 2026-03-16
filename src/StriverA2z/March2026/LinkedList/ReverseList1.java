package StriverA2z.March2026.LinkedList;


class ListNode2 {
    int val;
    ListNode next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseList1 {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
