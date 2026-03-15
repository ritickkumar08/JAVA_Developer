package StriverA2z.March2026.LinkedList;


class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
class ReverseList {
    public static void main(String[] args) {

    }
    public ListNode1 reverseList(ListNode1 head) {
        ListNode1 prev = null;
        ListNode1 curr = head;

        while(curr != null){
            ListNode1 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}