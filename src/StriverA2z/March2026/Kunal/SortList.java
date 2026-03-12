package StriverA2z.March2026.Kunal;

class SortList {
    public Node sortList(Node head) {
        // Base condition:
        // If list is empty OR has only one node, it is already sorted
        if(head == null || head.next == null){
            return head;
        }

        // Find the middle of the linked list
        Node mid = getMid(head);

        // Recursively sort the left half
        Node left = sortList(head);
        // Recursively sort the right half
        Node right = sortList(mid);

        // Merge the two sorted halves
        return merge(left, right);
    }

    public Node merge(Node list1, Node list2){
        // Dummy node helps simplify edge cases
        Node dummy = new Node(-1);
        System.out.println(dummy);
        // Pointer used to build the merged list
        Node current = dummy;

        // Traverse both lists until one becomes empty
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1 != null){
            current.next = list1;
        }
        if (list2 != null){
            current.next = list2;
        }

        return dummy.next;
    }

    // Function to find the middle of the linked list
    // It also splits the list into two halves
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        // This will keep track of the node before slow
        Node prev = null;

        while(fast != null && fast.next != null){
            // Keep track of previous node
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null){
            prev.next = null;
        }
        // slow now represents the head of the second half
        return slow;
    }
}

class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}