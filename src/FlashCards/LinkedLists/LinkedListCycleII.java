package FlashCards.LinkedLists;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        Boolean hasCycle = false;
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            // System.out.println(slowPointer.val + "--" + fastPointer.val);

            if (slowPointer == fastPointer) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle) {
            ListNode slowPointer2 = head;
            
            while (slowPointer != slowPointer2) {
                // System.out.println(slowPointer.val + "--" + slowPointer2.val);

                slowPointer = slowPointer.next;
                slowPointer2 = slowPointer2.next;
            }

            return slowPointer2;
        }

        return null;
    }

    public static void main(String[] args) throws Exception {
        LinkedListCycleII solver = new LinkedListCycleII();

        Integer[] array1 = {3,2,0,-4};
        ListNode root1 = ListNode.constructList(array1);
        ListNode.setCycle(root1,1);
        System.out.println(solver.detectCycle(root1).val);

        Integer[] array2 = {1,2};
        ListNode root2 = ListNode.constructList(array2);
        ListNode.setCycle(root2,0);
        System.out.println(solver.detectCycle(root2));

        Integer[] array3 = {1};
        ListNode root3 = ListNode.constructList(array3);
        // ListNode.setCycle(root2,0);
        System.out.println(solver.detectCycle(root3));
    }  
}
