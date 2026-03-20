package StriverA2z.March2026.LinkedList;

class ReverseKGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ReverseKGroup ob = new ReverseKGroup();
        ListNode results = ob.reverseKGroup(head,k);
        ListNode temp = results;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        //if the list doesn't contain any nodes then return the head or k is 1 then the list will remain same.
        if(head == null || k == 1){
            return head;
        }
        //Dummy node avoids headache when head changes
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //node before the current group
        ListNode groupPrev = dummy;

        while(true){
            ListNode kth = groupPrev;
            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if(kth == null){ //If you can’t reach k nodes, stop → return result
                    return dummy.next;
                }
            }

            //the start of the next group.
            ListNode groupNext = kth.next;

            //now to reverse the k nodes.
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while(curr != groupNext){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            //reconnecting the list after reversal
            ListNode temp = groupPrev.next; //This is the start of group before reversal
            // After reversal → becomes the end of group
            groupPrev.next = kth;//Connect previous part to new head of reversed group

            groupPrev = temp;//Move groupPrev forward for next iteration
        }
    }

}