package FlashCards.LinkedLists;

// import java.lang.classfile.components.ClassPrinter.Node;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
    	while (head != null && head.val == val) {
    		head = head.next;
    	}
    	
    	ListNode curNode = head;
    	
    	while (curNode != null && curNode.next != null) {
    		if (curNode.next.val == val) {
    			curNode.next = curNode.next.next;
    		}
    		else {
    			curNode = curNode.next;
    		}
    	}
    	
    	return head;
    }

    public static void main(String[] args) throws Exception {
        RemoveLinkedListElements solver = new RemoveLinkedListElements();

        Integer[] array1 = {1,2,6,3,4,5,6};
        ListNode head1 = ListNode.constructList(array1);
        int val = 6;
        ListNode.print(solver.removeElements(head1, val));

         Integer[] array2 = {};
         ListNode head2 = ListNode.constructList(array2);
         int val2 = 1;
         ListNode.print(solver.removeElements(head2, val2));

         Integer[] array3 = {7,7,7,7};
         ListNode head3 = ListNode.constructList(array3);
         int val3 = 7;
         ListNode.print(solver.removeElements(head3, val3));
    }  
}
