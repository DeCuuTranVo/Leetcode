package problems;

import java.util.List;

public class Problem_0876 {
    /**
 * Definition for singly-linked list.

 */
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        int nodeCount = 1;
        int midPos = 0;

        ListNode cur = head;
        
        while(cur.next != null) {
            nodeCount++;
            cur = cur.next;
        }

        midPos = nodeCount / 2;

        for (int i = 0; i < midPos; i++) {
            head = head.next;
        }

        return head;
    }

  
}
