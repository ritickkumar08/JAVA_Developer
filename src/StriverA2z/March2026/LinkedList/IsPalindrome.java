package StriverA2z.March2026.LinkedList;

class IsPalindrome {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);

        IsPalindrome ob = new IsPalindrome();
        boolean ans = ob.isPalindrome(head);
        System.out.println(ans);
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // find middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // compare halves
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            second = second.next;
            first = first.next;
        }
        return true;
    }
}