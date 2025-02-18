package FlashCards.LinkedLists;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class LinkedListCycle {
    // public class ListNode {
    //     int val;
    //     ListNode next;
    //     ListNode(int x) {
    //         val = x;
    //         next = null;
    //     }
    // }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while (slowPointer != fastPointer) {
            if (fastPointer == null || fastPointer.next == null) {
                return false;
            }

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        LinkedListCycle solver = new LinkedListCycle();

        Integer[] array1 = {3,2,0,-4};
        ListNode root1 = ListNode.constructList(array1);
        ListNode.setCycle(root1,1);
        System.out.println(solver.hasCycle(root1));

        Integer[] array2 = {1,2};
        ListNode root2 = ListNode.constructList(array2);
        ListNode.setCycle(root2,0);
        System.out.println(solver.hasCycle(root2));

        Integer[] array3 = {1};
        ListNode root3 = ListNode.constructList(array3);
        // ListNode.setCycle(root2,0);
        System.out.println(solver.hasCycle(root3));
    }  
}
