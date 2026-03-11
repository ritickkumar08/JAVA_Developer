package StriverA2z.March2026.Kunal.hehe;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //a list to hold the merged values.
        ListNode dummy = new ListNode(-1);

        //now to keep a track of the current pointer
        ListNode curent = dummy;

        // loop until one of the lists becomes empty
        while(list1 != null && list2 != null){
            // compare values of the current nodes
            if(list1.val <= list2.val){
                // attach list1 node to merged list
                curent.next = list1;
                // move list1 pointer forward
                list1 = list1.next;
            }else {
                curent.next = list2;
                list2 = list2.next;
            }
            // move the current pointer forward
            // because we just attached a node
            curent = curent.next;
        }
        //iif the nodes of first list are left
        if(list1 != null){
            curent.next = list1;
        }
        //iff the nodes of second list are left
        if(list2 != null){
            curent.next = list2;
        }

        // dummy.next is the real head of the merged list
        return dummy.next;
    }

    // helper function to print linked list
    public static void printList(ListNode head) {
        // start from head
        ListNode temp = head;
        // traverse until end
        while (temp != null) {
            // print value
            System.out.print(temp.val + " -> ");
            // move to next node
            temp = temp.next;
        }
        // mark end of list
        System.out.println("null");
    }

    public static void main(String[] args) {
        // creating first linked list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // creating second linked list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // create object of solution class
        Solution obj = new Solution();

        ListNode merged = obj.mergeTwoLists(list1, list2);

        printList(merged);
    }
}