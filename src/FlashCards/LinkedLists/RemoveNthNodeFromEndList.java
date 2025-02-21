package FlashCards.LinkedLists;

public class RemoveNthNodeFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode slowPointer = dummyHead;
        ListNode fastPointer = dummyHead;

        for (int i = 1; i <= n + 1; i++) {
            fastPointer = fastPointer.next;
        }        

        while (fastPointer != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        slowPointer.next = slowPointer.next.next;

        return dummyHead.next;
    }

    public static void main(String[] args) throws Exception {
        RemoveNthNodeFromEndList solver = new RemoveNthNodeFromEndList();

        Integer[] array1 = {1,2,3,4,5};
        ListNode root1 = ListNode.constructList(array1);
        int n1 = 2;
        ListNode.print(solver.removeNthFromEnd(root1, n1));

        Integer[] array2 = {1};
        ListNode root2 = ListNode.constructList(array2);
        int n2 = 1;
        ListNode.print(solver.removeNthFromEnd(root2, n2));

        Integer[] array3 = {1,2};
        ListNode root3 = ListNode.constructList(array3);
        int n3 = 1;
        ListNode.print(solver.removeNthFromEnd(root3, n3));
    }  
}
