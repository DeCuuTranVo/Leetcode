package FlashCards.LinkedLists;

public class IntersectionTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            if (pointerA == null) {
                pointerA = headB;
            }
            else {
                pointerA = pointerA.next;
            }

            if (pointerB == null) {
                pointerB = headA;
            }
            else {
                pointerB = pointerB.next;
            }
        }

        return pointerA;
    }

    public static void main(String[] args) throws Exception {
        IntersectionTwoLinkedLists solution = new IntersectionTwoLinkedLists();

        // Testcase 1
        Integer[] array1_1 = {4,1,8,4,5};
        ListNode root1_1 = ListNode.constructList(array1_1);
        Integer[] array1_2 = {5,6,1};
        ListNode root1_2 = ListNode.constructList(array1_2);

        int skipA = 1; 
        int skipB = 2;

        ListNode p1_1 = root1_1;
        ListNode p1_2 = root1_2;
        for (int i = 0; i < skipA; i++) {
            p1_1 = p1_1.next;
        }
        for (int i = 0; i < skipB-1; i++) {
            p1_2 = p1_2.next;
        }
        p1_2.next = p1_1;

        // ListNode p1_3 = root1_2;
        // while (p1_3 != null) {
        //     System.out.println(p1_3.val);
        //     p1_3 = p1_3.next;
        // }

        ListNode.print(solution.getIntersectionNode(root1_1, root1_2));

        // Testcase 2
        Integer[] array2_1 = {1,9,1,2,4};
        ListNode root2_1 = ListNode.constructList(array2_1);
        Integer[] array2_2 = {3,2,4};
        ListNode root2_2 = ListNode.constructList(array2_2);

        int skipA_2 = 3; 
        int skipB_2 = 1;

        ListNode p2_1 = root2_1;
        ListNode p2_2 = root2_2;
        for (int i = 0; i < skipA_2; i++) {
            p2_1 = p2_1.next;
        }
        for (int i = 0; i < skipB_2-1; i++) {
            p2_2 = p2_2.next;
        }
        p2_2.next = p2_1;

        // ListNode p2_3 = root2_2;
        // while (p2_3 != null) {
        //     System.out.println(p2_3.val);
        //     p2_3 = p2_3.next;
        // }

        ListNode.print(solution.getIntersectionNode(root2_1, root2_2));

        // Testcase 3
        Integer[] array3_1 = {2,6,4};
        ListNode root3_1 = ListNode.constructList(array3_1);
        Integer[] array3_2 = {1,5};
        ListNode root3_2 = ListNode.constructList(array3_2);

        int skipA_3 = 3; 
        int skipB_3 = 2;

        ListNode p3_1 = root3_1;
        ListNode p3_2 = root3_2;
        for (int i = 0; i < skipA_3; i++) {
            p3_1 = p3_1.next;
        }
        for (int i = 0; i < skipB_3-1; i++) {
            p3_2 = p3_2.next;
        }
        p3_2.next = p3_1;

        // ListNode p3_3 = root3_2;
        // while (p3_3 != null) {
        //     System.out.println(p3_3.val);
        //     p3_3 = p3_3.next;
        // }

        ListNode.print(solution.getIntersectionNode(root3_1, root3_2));
        
        // ListNode.print(solution.getIntersectionNode(root, root1));
    }  
}
