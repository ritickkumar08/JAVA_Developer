package StriverA2z.March2026.LinkedList;

class ReorderList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(4);

        ReorderList ob = new ReorderList();
        ob.reorderList(head);
    }
    public void reorderList(ListNode head) {
        //if the given list only contains one element or no element then just return no operations can be performed
        if(head == null || head.next == null){
            return;
        }

        // Step 1: Find middle
        ListNode mid = findMid(head);
//        System.out.println(mid);

        // Step 2: Reverse second half
        ListNode headSecond = reverseList(mid.next);
        mid.next = null; // break the list
//        System.out.println(reversedHead);

        // Step 3: Merge
        ListNode headFirst = head;

        //now we have to rearrange.
        while(headSecond != null){
            ListNode temp1 = headFirst.next;
            ListNode temp2 = headSecond.next;

            //for the nodes starting from the nodefirst.
            headFirst.next = headSecond;
            //for the arrangement of nodes after the mid the secondhead.
            headSecond.next = headFirst;

            headFirst = temp1;
            headSecond = temp2;
        }
        //setting the tail of to null.
        if(headFirst != null){
            headFirst.next = null;
        }
    }

    private ListNode reverseList(ListNode head) {
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

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}