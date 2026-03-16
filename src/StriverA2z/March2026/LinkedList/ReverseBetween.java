package StriverA2z.March2026.LinkedList;


class ListNode3 {
    int val;
    ListNode next;
    ListNode3() {}
    ListNode3(int val) { this.val = val; }
    ListNode3(int val, ListNode next) { this.val = val; this.next = next; }
}
class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        //detecting the starting node or the left node.
        ListNode curr = head;
        ListNode prev = null;
        for (int i = 0;curr != null && i < left- 1; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode last = prev;
        ListNode newEnd = curr;

        //reverse between left and right
        for (int i = 0;curr != null && i < right - left + 1; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(last != null){
            last.next = prev;
        }else {
            head = prev;
        }
        newEnd.next = curr;

        return head;
    }
}