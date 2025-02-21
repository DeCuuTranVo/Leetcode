package FlashCards.LinkedLists;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode curNode = head;

        while (curNode != null) {
            ListNode nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }

        return prevNode;
    }

    public static void main(String[] args) throws Exception {
        ReverseLinkedList solver = new ReverseLinkedList();

        Integer[] array1 = {1,2,3,4,5};
        ListNode root1 = ListNode.constructList(array1);
        ListNode.print(solver.reverseList(root1));

        Integer[] array2 = {1,2};
        ListNode root2 = ListNode.constructList(array2);
        ListNode.print(solver.reverseList(root2));

        Integer[] array3 = {};
        ListNode root3 = ListNode.constructList(array3);
        ListNode.print(solver.reverseList(root3));
    }  
}
